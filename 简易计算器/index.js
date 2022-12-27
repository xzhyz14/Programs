
//计算器输入参数
function input(ele) {
    let strHeaderValue = document.getElementById("header-value");
    let strHeaderValue2 = document.createElement("span");
    strHeaderValue2.innerHTML = ele;
    strHeaderValue.appendChild(strHeaderValue2);
    //遇到C清0
    if (ele == "C") {
        let span = document.getElementsByTagName("span");
        for (let index = 0; index < span.length; index++) {
            let a = span[index].innerHTML = "";
        }
    }
}


//点击计算器按钮显示参数
function clickStr() {
    let str = "";
    let ele = document.getElementsByTagName("li");
    for (i = 0; i < ele.length; i++) {
        ele[i].onclick = function () {
            input(this.innerHTML);
            if (this.innerHTML == "C") {
                str = "";
                return;
            }
            str += this.innerHTML;

            let ele = document.getElementsByClassName("equalBtn")[0];
            ele.onclick = function () {
                let fuHaoIndex = 0;
                let fuHao = "";
                let num1 = "";
                let num2 = "";
                for (let index = 0; index < str.length; index++) {
                    if (str[index] == "+" || str[index] == "-" || str[index] == "x" || str[index] == "%") {
                        fuHaoIndex = index;
                        fuHao = str[index];
                        // console.log(fuHao);
                        break;
                    }
                }

                for (let index = 0; index < fuHaoIndex; index++) {
                    num1 += str[index];
                }
                num1 = parseFloat(num1);

                for (let index = fuHaoIndex + 1; index < str.length; index++) {
                    num2 += str[index];
                }
                num2 = parseFloat(num2);
               
                switch (fuHao) {
                    case "+":
                        input("C")
                        input(num1 + num2);
                        break;

                    case "-":
                        input("C")
                        input(num1 - num2);
                        break;

                    case "x":
                        input("C")
                        input(num1 * num2);
                        break;

                    case "%":
                        input("C")
                        if(num2 == 0){
                            input("ERR");
                        }else{
                            input(num1 / num2);
                        }
                    default:
                        break;
                }
            }

        }
    }
}
clickStr();