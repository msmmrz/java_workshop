package com.ds.usc;

public class checkingsepah {
    public checkingsepah() throws Exception {
        final String static_name = "amirreza";
        final String static_lastname = "delavaran";
        final String static_fathername = "ebi";
        final long melli = 981113019;
        final int orgage = 19;
        Bank_Sepah bank_sepah = new Bank_Sepah();


        if(bank_sepah.name.equals(static_name) && bank_sepah.lastname.equals(static_lastname)
                && bank_sepah.fathername.equals(static_fathername) &&
                bank_sepah.age == orgage && bank_sepah.mellicode == melli ){

        }
        else
            throw new Exception ("incorrect value");
    }
}
