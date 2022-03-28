/**
 * 测试switch语句
 */
public class TestSwitch {
    public static void main(String[] args) {
        //grade表示大学年级
        int  grade = 1;

        if(grade==1) {
            System.out.println("大学一年级，可以放松一下，学着谈谈恋爱");
        }else if(grade==2){
            System.out.println("大学二年级，少玩点游戏，不空虚，不慌嘛？");
        }else if(grade==3) {
            System.out.println("大学三年级，专业课开始了，好好学，找份好工作");
        }else{
            System.out.println("大四了，要毕业了。因为跟着尚学堂学习，好工作搞定！");
        }

        switch (grade){
            case 1:
                System.out.println("大学一年级！");
                break;
            case 2:
                System.out.println("大学二年级！");
                break;
            case 3:
                System.out.println("大学三年级！");
                break;
            default:
                System.out.println("大学四年级");
                break;
        }

        int month = 2;  //1表示1月，2表示2月...
        if(month==1||month==2||month==3) {
            System.out.println("春季！");
        }else if(month==4||month==5||month==6){
            System.out.println("夏季！");
        }else if(month==7||month==8||month==9){
            System.out.println("秋季！");
        }else{
            System.out.println("冬季！");
        }

        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("春季！");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季！");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季！");
                break;
            default:
                System.out.println("冬季！");
                break;
        }


        String car = "比亚迪";
        //switch表达式接收的：整数、枚举、字符串
        switch (car){
            case "奥迪":
                System.out.println("我买了一个奥迪车！");
                break;
            case "奔驰":
                System.out.println("买了一个大奔！");
                break;
            case "比亚迪":
                System.out.println("比亚迪，挺好！");
                break;
            default:
                System.out.println("吉利！");
                break;
        }




    }
}
