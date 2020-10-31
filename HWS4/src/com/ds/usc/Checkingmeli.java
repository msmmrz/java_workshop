package com.ds.usc;

public class Checkingmeli {
    public Checkingmeli() throws Exception {
        final String static_name = "amirali";
        final String static_lastname = "delavaran";
        final String static_fathername = "ebi";
        final long melli = 981113018;
        final int orgage = 22;
        Bank_Meli bank_meli = new Bank_Meli();

            if(bank_meli.name.equals(static_name) && bank_meli.lastname.equals(static_lastname)
                    && bank_meli.fathername.equals(static_fathername) &&
                    bank_meli.age == orgage && bank_meli.mellicode == melli ){

            }
                else
                throw new Exception ("incorrect value");
    }
}
