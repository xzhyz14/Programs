/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 50740
 Source Host           : localhost:3306
 Source Schema         : jdbc2

 Target Server Type    : MySQL
 Target Server Version : 50740
 File Encoding         : 65001

 Date: 16/12/2022 09:28:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `source` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `date` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (1, '激发思想共鸣 汇聚精神力量', '央视网', '党的二十大科学谋划了未来一个时期党和国家事业发展的目标任务和大政方针，擘画了以中国式现代化全面推进中华民族伟大复兴的宏伟蓝图，对指引党和人民向第二个百年奋斗目标进军、奋力谱写新时代中国特色社会主义更加绚丽的华章，具有重大而深远的意义。\r\n\r\n　　一个多月来，学习贯彻党的二十大精神中央宣讲团成员分赴31个省（区、市）、新疆生产建设兵团和香港、澳门特别行政区及有关系统、部门、单位，开展系列宣讲活动，推动大会精神深入群众、深入人心。\r\n\r\n　　连日来，中央宣讲团共作报告84场，举办各种形式的互动交流活动50多场，直接听众101万人，通过电视直播、网络转播等渠道间接收听收看人数达2200多万。', '2022-12-08');
INSERT INTO `news` VALUES (2, '建设人与自然和谐共生的美丽中国', '央视网', '在湖区工作了30年的徐文彬一直观测着湿地与候鸟的变化，这一本本手账生动地记录下十年来，升金湖从无序开发、生态环境失衡、候鸟数量锐减，到生态修复、再现和谐美景的变化过程。\r\n\r\n　　良好生态环境是最公平的公共产品，是最普惠的民生福祉，也是人民向往的美好生活。\r\n\r\n　　党的十八大以来，以习近平同志为核心的党中央以前所未有的力度推动生态文明建设，坚决向污染宣战，把生态文明建设作为关系中华民族永续发展的根本大计、建设美丽中国的必然选择。发布实施大气十条、水十条、土十条，集中攻克百姓身边的生态环境问题。\r\n\r\n　　“共抓大保护、不搞大开发。”长江经济带生态环境保护发生转折性变化。\r\n\r\n　　“治理黄河，重在保护，要在治理。”黄河治理的难题正在一步步得到解答，母亲河重新焕发生机活力。\r\n\r\n　　“绿水青山就是金山银山”，美丽中国建设迈出重大步伐：山水林田湖草沙一体化保护和系统治理，生态安全屏障有效巩固，全球新增森林面积有四分之一来自中国，沙化土地重点治理区实现了由“沙进人退”到“绿进沙退”的历史性转变；112种特有珍稀濒危野生动植物实现野外回归，曾经被认为已经灭绝的彩鹮再次出现。\r\n\r\n　　大力推进生态优先、节约集约、绿色低碳发展。', '2022-12-03');
INSERT INTO `news` VALUES (3, '面向基层宣讲 推动党的二十大精神深入人心', '央视网', '吉林省组建了二十大基层党代表宣讲团、高质量发展宣讲团、青年教师宣讲团等多个专题宣讲团，为不同群体量身定制宣讲内容。东辽县朝阳村党总支书记韩丽是吉林省二十大基层党代表宣讲团的一名成员。她带着村民们一边学习二十大精神，一边谋划乡村振兴。学习宣传贯彻党的二十大精神，上海市组织了4600多支宣讲队伍进行宣讲，覆盖近83万名党员、群众。在虹口区旧区改造指挥部，宣讲员结合受众日常工作，就“增进民生福祉，提高人民生活品质”等主题进行宣讲，让人们深受启发。安徽省采取省市县乡村五级联动，推动党的二十大精神深入生产建设一线。在合肥综合性国家科学中心，宣讲员围绕加快实施创新驱动发展战略等内容，向园区科技工作者宣讲党的二十大精神。\r\n\r\n　　让党的二十大精神在基层落地生根，江西省基层宣讲员开展了面对面、互动化、分众化宣讲。在抚州市黎川县的社区，党员干部和居民一起认真学习大会精神，对照报告要求，以党建引领基层治理，优化完善公共服务水平。', '2022-12-03');
INSERT INTO `news` VALUES (4, '接过红旗渠精神“接力棒”踏上新征程', '央视网', '戴上头盔，穿上救生服，整理好工具，骑上摩托车，张学义和同事结伴开始了一天的巡渠工作，到无法骑行的路段，他们就弃车步行。\r\n\r\n　　“爷爷因修渠牺牲，父亲13岁就被奶奶送到渠上，父辈们苦战多年，终于修好了渠。作为渠三代，我有责任、有义务传承红旗渠精神，看好渠、护好渠、管好渠。”红旗渠灌区管理处合涧渠管所的张学义护渠一干就是20多年。\r\n\r\n　　三代人，一条渠。张学义是林州青年一代传承红旗渠精神的代表。他说，让红旗渠的水一直流淌下去，精神传承下去，继续造福百姓，就是我们这代人的使命。\r\n\r\n　　20世纪60年代，河南安阳的林县（今林州市）人民为改变干旱缺水的困境，苦战十个春秋，在太行山腰凿出了一条1500公里的“人工天河”红旗渠，并孕育出“自力更生、艰苦创业、团结协作、无私奉献”的红旗渠精神。如今，林州青年一代接过红旗渠精神的“接力棒”，在各条战线上奋发作为。 这是蜿蜒穿行于太行山间的红旗渠总干渠（2019年7月4日摄，无人机照片）。新华社记者李安摄\r\n\r\n　　作为身在红旗渠畔的一名企业工作者，从小听着红旗渠故事长大的李志伟选择了技术门槛高、投资金额大、回报周期长的电子级玻璃纤维产业从零起步艰苦创业。当初面对反对之声，李志伟说：“红旗渠这一‘重新安排河山’的壮举都能实现，这点困难算什么，我们的项目也一定能干成！”\r\n\r\n　　创业十年来，靠着自力更生、艰苦奋斗，如今李志伟带领公司员工已攻克自主核心技术31项，获得国家授权专利140项。\r\n\r\n　　党的二十大报告提出，在全社会弘扬劳动精神、奋斗精神、奉献精神、创造精神、勤俭节约精神。“这与红旗渠精神一脉相承。”李志伟说，“作为红旗渠的后人，我们要把红旗渠精神根植到企业发展中去，把红旗渠精神转化成干事创业的动力。”\r\n\r\n　　企业谋转型，乡村忙振兴。在林州市黄华镇止方村，记者入村便看到，宽敞平坦的街道中心是各式各样精致有趣的雕塑小景，两侧是整齐划一的二层农家小院，青砖灰瓦，别具一格。而数年前，止方村还是一个村集体收入为零、连主街道都没修通的落后村。“红旗渠都能修通，一条路还打不通！”2014年，返乡党员郭青松被选举为村党支部书记。面对群众修路的呼声和各种困难，郭青松发动党员干部带头上，与村两委干部、党员和群众代表一起谋划，自筹资金垫付工程款和补偿款，把影响全村发展的主街道彻底打通。\r\n\r\n　　此后，这个太行山下的小山村一年一个样。2016年，修建了党建广场，安装了天然气；2017年，用上了太阳能路灯；2018年，清洁取暖、厕所革命、污水管网等工程相继完工……村容大变样，止方村抢抓机遇发展旅游，在村里修建了音乐喷泉、美食一条街，发展成远近闻名的“网红村”。2020年，止方村集体收入突破100万元，2021年达到118万元。现在，止方村每周的农民夜校里，干部群众齐聚一起学习党的二十大精神，重温红旗渠故事。“党的二十大报告提出，全面推进乡村振兴。乡村要振兴，就要克服万难，红旗渠精神就是我们攻坚克难的‘法宝’。”郭青松说，“每天看到红旗渠的水，就能感受到先辈们的精神力量。我们今后要全面学习贯彻党的二十大精神，巩固拓展脱贫攻坚成果，拿出当年建红旗渠的劲儿全面推进乡村振兴。”\r\n\r\n　　“给人以星火者，必心怀火炬”。作为红旗渠干部学院的青年教师和“渠四代”，李媛近三年来向来自大江南北的6000多名学员讲述了红旗渠的故事。为了让红旗渠精神传得更久、更远，她常去拜访修渠老人，认真聆听他们在那段艰苦奋斗岁月里的修渠故事。\r\n\r\n　　“年轻一代要继承和发扬吃苦耐劳、自力更生、艰苦奋斗的精神，像我们的父辈一样把青春热血镌刻在历史的丰碑上。”李媛说，“我非常幸运能在红旗渠干部学院担任教师，延续几代人对红旗渠的记忆与情怀。红旗渠精神永在！我们一定用自己的青春与汗水在新时代的答卷上留下红旗渠精神传人浓墨重彩的一笔。”', '2022-11-26');
INSERT INTO `news` VALUES (5, '把有意义的事情讲得有意思', '央视网', '“提问：党代会有哪些议程……”徐川侧过身，轻点鼠标。投影屏幕上，跳出一行字：“从这里，读懂中国——走近党代会”。\r\n\r\n　　这是南京航空航天大学的一堂思政课。主讲人是党的二十大代表、南京航空航天大学马克思主义学院党委书记徐川。\r\n\r\n　　互动环节，徐川在屏幕上打出20世纪80年代以来历次党代会的主题，引导同学们前后贯通学，深刻领会党的二十大的主题。\r\n\r\n　　“回望我们从何而来、思考我们身在何处，就不难判断我们将前往何方。我们党为实现中华民族伟大复兴，一棒接着一棒，一张蓝图绘到底……”学生们热烈讨论后，徐川进行总结。\r\n\r\n　　“徐老师讲的内容，不是书上搬来的、网上下载的，而是正在发生的真实见闻。”在大一学生高圣诏看来，徐川把有意义的事情讲得有意思，“我们喜欢听、记得牢，也会引发更多思考。”出席党的二十大之后回到南京，除了立足教学岗位、讲好思政课，徐川还作为江苏省委宣讲团成员进社区、进企业宣讲。对象不同、场景不同，备课内容和角度也不同。“给学生上思政课，要结合教学大纲，将最新教材——党的二十大报告融入进去；走出去宣讲，就要结合行业和地方特点，进行专题讲解。”徐川说。\r\n\r\n　　晚上6点，一天的宣讲和课程结束，徐川回到办公室。倒上一杯热水，他又开启“网上课堂”——拥有30万粉丝的个人微信公众号“南航徐川”。\r\n\r\n　　逐一查看后台新消息，回复网友留言，徐川一下子来了精神，“面对网络上的青年群体，找到他们喜爱的话题、语言和方式，像朋友一样交流谈心、娓娓道来，让他们加深对党的理论与实践的认识和理解。”这段时间，徐川还拍摄了党的二十大精神解读微视频《学习100·党的二十大精神青年说》《我说二十大》等，在江苏省委组织部、南航官微播发后备受关注。\r\n\r\n　　“党的二十大报告提出，‘坚持为党育人、为国育才’。作为思政工作者，我们要回答好‘培养什么人、怎样培养人、为谁培养人’这些教育的根本问题。”在学校主持党的二十大精神“进教材、进课堂、进头脑”集体备课会时，徐川鼓励同事们将立德树人根本任务润物无声地融入教学实践全过程。\r\n\r\n　　“徐书记跟我进行了深入交流，在大学物理这样的基础课中，可以将科学家精神以及科学世界观和方法论融入教学实例，如盐入水，化于无形但有滋有味。”物理学院副院长李晋斌说。最近，徐川正在紧锣密鼓地谋划两件事：一是给南京市中小学思政课教师上一堂公开课，二是组织劳模进校园、思政教师进企业。\r\n\r\n　　“用社会主义核心价值观铸魂育人，完善思想政治工作体系，推进大中小学思想政治教育一体化建设”——党的二十大报告中的这句话，被徐川记录在学习笔记的醒目位置。“讲好思政课，可以说广阔天地大有作为。”徐川说。', '2022-11-26');

SET FOREIGN_KEY_CHECKS = 1;
