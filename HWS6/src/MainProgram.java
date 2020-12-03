import java.util.ArrayList;

public class MainProgram {
   static ArrayList<Member> users_list ;
    public static void main(String[] args) {

        //------------------------------- member --------------------------
        Member user1 = new Member();
        Member user2 = new Member();
        Member user3 = new Member();
         users_list = new ArrayList<Member>();

        user1.setAll("ali" ,"hasani" ,"alihasani" ,"ali1234");
        user1.setAll("masoume" ,"mirzaee" ,"msm" ,"msm1234");
        user1.setAll("atefe" ,"porian" ,"pori" ,"ati1234");

        users_list.add(user1);
        users_list.add(user2);
        users_list.add(user3);








        //----------------------------- packages--------------------------------------
        InternetPackage[] internetPackage = new InternetPackage[9];

        String  Array_name[] = {"a","b","c","d","e","f","g","h","i"};
        String  Array_amount[] = {"1G","3G","7G","12G","15G","18G","25G","30G","unlimited"};
        String  Array_price[] = {"5000","15000","30000","400000","55000","65000","80000","100000","130000"};


        for (int i = 0; i < 9; i++) {
            internetPackage[i]= new InternetPackage();
            internetPackage[i].setAll(Array_name[i],Array_amount[i],Array_price[i]);
        }
        ArrayList<InternetPackage> monthly_list = new ArrayList<InternetPackage>();
        ArrayList<InternetPackage> weekly_list = new ArrayList<InternetPackage>();
        ArrayList<InternetPackage> daily_list = new ArrayList<InternetPackage>();


        monthly_list.add(internetPackage[6]);
        monthly_list.add(internetPackage[7]);
        monthly_list.add(internetPackage[8]);

        weekly_list.add(internetPackage[5]);
        weekly_list.add(internetPackage[4]);
        weekly_list.add(internetPackage[3]);

        daily_list.add(internetPackage[2]);
        daily_list.add(internetPackage[1]);
        daily_list.add(internetPackage[0]);


        //-------------------------------------- bought package ------------------------------

        ArrayList<InternetPackage> boughtPackages_list = new ArrayList<>();
        InternetPackage[] internetPackage_bought = new InternetPackage[9];


        String  Array_name2[] = {"af","bg"};
        String  Array_amount2[] = {"1fG","3G"};
        String  Array_price2[] = {"5008","150"};

        for (int i = 0; i < 2; i++) {
            internetPackage_bought[i]= new InternetPackage();
            internetPackage_bought[i].setAll(Array_name2[i],Array_amount2[i],Array_price2[i]);
            boughtPackages_list.add(internetPackage_bought[i]);
        }

        //----------------------------------------- start ------------------------------
        LoginPage loginPage = new LoginPage(returnValueOfCOl(daily_list) ,
                returnValueOfCOl(monthly_list) ,
                returnValueOfCOl(weekly_list),
                returnValueOfCOl(boughtPackages_list)
                );

    }




    public static String[][] returnValueOfCOl(ArrayList<InternetPackage> list){
        String [][] s = new String[100][3];
        int i=0;

        for (InternetPackage  elemnt :list ){

            s[i][0]=elemnt.getName();
            s[i][1] =elemnt.getPrice();
            s[i][2] =elemnt.getAmount();
            i++;

        }
        return s;
    }

    //------------------------------------login -----------------------------------------------
    public static Boolean Authentication(String username , String pass ){
        boolean result;
        for (Member i : users_list){
            if(username.equals(i.getUsername())  &&  pass.equals(i.getPass()))
                return true;
        }
        return false;
    }

}
