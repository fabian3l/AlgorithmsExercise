package pl.lepsy.codeGym;

public class HumanReadableTime {
    public static void main(String[] args) {

        System.out.println(makeReadable(3560));
    }
    public static String makeReadable(int seconds) {

        return String.format("%02d:%02d:%02d", seconds/3600, seconds/60%60, seconds % 60);


//        int hour = 0;
//        int minut = 0;
//        int second = 0;
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = 0; i < seconds; i++){
//            second++;
//            if (second % 60 == 0){
//                second = 0;
//                minut++;
//                if (minut % 60 == 0){
//                    minut = 0;
//                    hour++;
//                    if (hour == 100){
//                        break;
//                    }
//                }
//            }
//        }
//        String hourString = "";
//        String minuteString = "";
//        String secondString = "";
//        if (hour < 10){
//            hourString = "0" + hour;
//        }else{
//            hourString = String.valueOf(hour);
//        }
//        if (minut < 10){
//            minuteString = "0" + minut;
//        }else{
//            minuteString = String.valueOf(minut);
//        }if (second < 10){
//            secondString = "0" + second;
//        }else{
//            secondString = String.valueOf(second);
//        }
//
//        stringBuilder.append(hourString).append(":").append(minuteString).append(":").append(secondString);
//        String result = stringBuilder.toString();
//
//        return result;
    }
}
