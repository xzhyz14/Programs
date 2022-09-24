package hyx;

import java.util.*;

public class Demo {

    static ArrayList<String> cuoTiJi = new ArrayList<>();//错题集
    static String[] list = new String[100];//英译汉或汉译英的词库
    static HashMap<String, String> ciKu = new HashMap<>();//四级单词词库
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        testDemo(list, ciKu, cuoTiJi);
    }

    /**
     * 执行程序
     */
    private static void testDemo(String[] list, HashMap<String, String> ciKu, ArrayList<String> cuoTiJi) {
        while (true) {
            tiShi();
            int selectNumber = sc.nextInt();
            switch (selectNumber) {
                case 1://英译汉
                    bianLiDanCi(siJiCiKu(ciKu));
                    yingYiHan(list, ciKu, cuoTiJi);
                    clean(list);
                    continue;

                case 2://汉译英
                    bianLiDanCiFanYi(siJiCiKu(ciKu));
                    hanYiYing(list, ciKu, cuoTiJi);
                    clean(list);
                    continue;

                case 3://打印错误列表
                    System.out.println("打印错误列表");
                    outCuoTiJi(cuoTiJi);
                    continue;

                case 4://退出程序
                    System.out.println("程序退出成功！");
                    return;

                default:
                    System.out.println("非法输入，请重新输入正确的操作序号！");
                    continue;
            }
        }
    }


    /**
     * 功能选项面板
     */
    private static void tiShi() {
        System.out.println("请选择你需要的功能：");
        System.out.println("1.英译汉");
        System.out.println("2.汉译英");
        System.out.println("3.打印错误列表");
        System.out.println("4.退出程序");
        return;
    }


    /**
     * 随机数
     */
    private static int suiJiShu(String[] list) {
        Random r = new Random();
        while (true) {//有效随机数
            int random = r.nextInt(list.length);
            if (list[random] == null){
                continue;
            }else {
                return random;
            }
        }
    }


    /**
     * 打印错题集
     * @param cuoTiJi
     */
    private static void outCuoTiJi(ArrayList<String> cuoTiJi) {
        for (String str : cuoTiJi){
            System.out.println(str);
        }
        return;
    }

    /**
     * 在切换“英译汉”或“汉译英”时清空公共仓库
     */
    private static void clean(String[] list) {
        if(list != null){
            for (int i = 0; i < list.length; i++) {
                list[i] = null;
            }
        }
        return;
    }

    /**
     * 遍历单词并加入至英译汉集合中
     * @param ciKu 词库
     */
    private static void bianLiDanCi(HashMap<String,String> ciKu) {
        Iterator<Map.Entry<String, String>> iterator = ciKu.entrySet().iterator();
        int index = 0;
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            if(index == list.length-1){//避免索引越界
                return;
            }
            list[index] = next.getKey();
            index++;

        }
        return;
    }


    /**
     * 英译汉
     * @param list 随机打印英语单词
     * @param ciKu 词库
     * @param cuoTiJi 错题集
     * @return 错题集
     */
    private static ArrayList<String> yingYiHan(String[] list, HashMap<String, String> ciKu, ArrayList<String> cuoTiJi) {
        System.out.println("==========英译汉==============");
        System.out.println("请输入以下单词对应的汉语意思");
        for (int i=0;i<10;i++)//每次出10个单词
        {

            String danCi = list[suiJiShu(list)];//词库遍历
            Iterator<Map.Entry<String, String>> iterator = ciKu.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<String, String> next = iterator.next();

                //单词翻译拼写检查
                if(next.getKey().equals(danCi)){
                    System.out.println(danCi);
                    String danCiFanYi = sc.next();
                    if (next.getValue().equals(danCiFanYi)== false){
                        cuoTiJi.add(next.getKey() + "——" + next.getValue());
                    }
                }
            }
        }
        return cuoTiJi;
    }

    /**
     * 遍历单词翻译并加入汉译英集合中
     * @param ciKu 词库
     */
    private static void bianLiDanCiFanYi(HashMap<String,String> ciKu) {
        Iterator<Map.Entry<String, String>> iterator = ciKu.entrySet().iterator();
        int index = 0;
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            if(index == list.length-1){//避免索引越界
                return;
            }
            list[index] = next.getValue();
            index++;
        }
        return;
    }

    /**
     * 汉译英
     * @param list 随机打印英语翻译
     * @param ciKu 词库
     * @param cuoTiJi 错题集
     * @return 错题集
     */
    private static ArrayList<String> hanYiYing(String[] list, HashMap<String, String> ciKu, ArrayList<String> cuoTiJi){
        System.out.println("================欢迎来到汉译英===================");
        System.out.println("请输入以下中文对应的英语单词");

        for (int i=0;i<10;i++)//每次出10个单词
        {

            String hanYu = list[suiJiShu(list)];//词库遍历
            Iterator<Map.Entry<String, String>> iterator = ciKu.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<String, String> next = iterator.next();

                //单词翻译拼写检查
                if(next.getValue().equals(hanYu)){
                    System.out.println(hanYu);
                    String danCi = sc.next();
                    if (next.getKey().equals(danCi)== false){
                        cuoTiJi.add(next.getValue() + "——" +  next.getKey());
                    }
                }
            }
        }


        return cuoTiJi;
    }

    /**
     * 这是四级英语考试的词汇库
     */
    private static HashMap siJiCiKu(HashMap<String, String> ciKu) {

        ciKu.put("ability", "能力");
        ciKu.put("abundant", "丰富的");
        ciKu.put("access to", "接近");
        ciKu.put("accommodation", "住宿");
        ciKu.put("accomplish", "完成");
        ciKu.put("achieve", "完成");
        ciKu.put("acquaintance", "熟人");
//        ciKu.put("", "");
        return ciKu;
    }



}
