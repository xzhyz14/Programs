
    let a1 = document.getElementsByTagName("input")[0];
    let year = 0;
    let month = 0;
    let day = 0;

    if(a1.value == ""){
        let a3 = new Date().toLocaleDateString().split("/");
        year = a3[0];
        month = a3[1];
        day = a3[2];
    }else if(a1.value != ""){
        let a3 = a1.value.split("/");
        year = a3[0];
        month = a3[1];
        day = a3[2];
    }

    // let months = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12];//月份
    let days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]//每月天数
    if (year % 400 == 0) {//闰年二月为29天
        days[1] = 29;
    }
    // let weekDays = ["星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"];
    let nowDay = year + "/" + month + "/" + 1;
    let firstDay = new Date(Date.parse(nowDay)).getDay();
    let lastDay = new Date(Date.parse(year + "/" + month + "/" + days[month - 1])).getDay();
    if (firstDay == 0) {
        firstDay = 7;
    }
    let spanceStart = firstDay % 7;//第一周空行
    if (spanceStart == 0) {
        spanceStart = 6;
    } else {
        spanceStart = spanceStart % 7 - 1;
    }
    let spanceEnd = 7 - lastDay;
    if (spanceEnd == 7) {
        spanceEnd = 0;
    }
    let weekNumber = (spanceStart + spanceEnd + days[month - 1]) / 7;//每月有几周

    let str = "";
    let num = 1 - spanceStart;
    for (let i = 0; i < weekNumber; i++) {
        str += "<tr>";
        for (let j = 0; j < 7; j++) {
            str += "<td>";
            if (num > 0 && num <= days[month - 1]) {
                str += num;
            }
            str += "</td>";
            num++;
        }
        str += "</tr>";
    }

    //表头
    let head = `
            <table border="1">
                    <tr>
                        <td colspan="7" style="text-align: center;">${year + "年" + month + "月" + day + "日"}</td>
                    </tr>
                    <tr>
                        <td>星期一</td>
                        <td>星期二</td>
                        <td>星期三</td>
                        <td>星期四</td>
                        <td>星期五</td>
                        <td>星期六</td>
                        <td>星期日</td>
                    </tr>
            </table>
`;
    let d1 = document.getElementsByTagName("div")[1];
    d1.innerHTML = head;
    let d2 = document.getElementsByTagName("table")[0];
    d2.innerHTML = head + str;

