package org.example.Dz_Nt_Packets.services;

public class VacationCulcService {

    public int calcVacation(int income, int expense, int treshHold){

        int countVacation = 0;
        int money = 0;

        for (int month = 0; month < 12 ;month++){

            if (money >= treshHold){
                countVacation++;
                money = (money - expense);
                money = money / 3;

            } else {
                money = money + income - expense;
            }

        }
        return countVacation;
    }
}
