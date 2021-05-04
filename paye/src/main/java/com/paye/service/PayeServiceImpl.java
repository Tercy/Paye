package com.paye.service;

public class PayeServiceImpl implements PayeService {

    public double incomeTax(double salary, int year, int age, double medicalAid) {
        double tax=0;
        switch (year) {
            case 2021:
                if (salary <= 205900)
                    tax = 0.018 * (salary - 205900);
                else if (salary <= 321600)
                    tax = 0.26 * (salary - 321600) + 37062;
                else if (salary <= 445100)
                    tax = (0.31 * (salary - 445100)) + 67144;
                else if (salary <= 584200)
                    tax = (0.36 * (salary - 584200)) + 105249;
                else if (salary <= 744800)
                    tax = (0.39 * (salary - 744800)) + 155505;
                else if (salary <= 1577300)
                    tax = (0.41 * (salary - 1577300)) + 218139;
                else
                    tax = (0.45 * (salary - 1577301)) + 559464;

            case 2020:
                if (salary <= 195850)
                    tax = 0.018 * (salary - 195850);
                else if (salary <= 321600)
                    tax = 0.26 * (salary - 30585) + 35253;
                else if (salary <= 423300)
                    tax = (0.31 * (salary - 423300)) + 63853;
                else if (salary <= 584200)
                    tax = (0.36 * (salary - 584200)) + 100263;
                else if (salary <= 744800)
                    tax = (0.39 * (salary - 744800)) + 147891;
                else if (salary <= 1577300)
                    tax = (0.41 * (salary - 1577300)) + 208488;
                else
                    tax = (0.45 * (salary - 1500001)) + 532041;




        }
        return tax;
    }
}
