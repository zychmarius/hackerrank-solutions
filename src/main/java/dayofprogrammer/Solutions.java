package dayofprogrammer;

public class Solutions{
        static String solve(int year){
            int days7Month = 215;
            int startMonth = 7;
            int daysMonth;
            int dayProgrammer = 256;
            if(year == 1918){
                daysMonth = days7Month + 15;
            }else if(year < 1918){
                if (year%4 == 0){
                    daysMonth = days7Month + 29;
                }else{
                    daysMonth = days7Month + 28;
                }
            }else{
                if(!(year % 400 != 0 && !(year % 4 == 0 && year % 100 != 0))){
                    daysMonth = days7Month + 29;
                }else {
                    daysMonth = days7Month + 28;
                }
            }
            int month = startMonth + 1;
            int difference = dayProgrammer - daysMonth;
            if (difference>30){
                daysMonth += 30;
                month++;
                difference = dayProgrammer - daysMonth;
            }
            month++;
            String dayProgramerDate;
            if(month<10){
                String stringMonth = "0"+month;
                dayProgramerDate = difference + "." + stringMonth + "." + year;
            }else {
                dayProgramerDate = difference + "." + month + "." + year;
            }
            return dayProgramerDate;
        }
}
