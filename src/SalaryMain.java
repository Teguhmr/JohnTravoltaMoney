import java.util.Scanner;

public class SalaryMain {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jam kerja Mr.John minggu ini: ");
        int workHour = input.nextInt();
        System.out.println("Masukan pengeluaran Mr.John minggu ini: ");
        int moneySpending = input.nextInt();

        // Calculate
        int salary = calculateSalary(workHour);
        String messageSaveMoney = saveMoneyMessage(salary, moneySpending);
        int savings = calculateAmountSaving(salary, moneySpending);

        // Output
        System.out.println("Dalam jam kerja "+workHour+" jam, dan pengeluaran seminggu Mr.John : Rp."+moneySpending);
        System.out.println("Gaji Mr.John minggu ini, sebesar: Rp."+salary);
        System.out.println("Status : "+messageSaveMoney);
        System.out.println("Mr.John dapat menabung di minggu ini, sebesar: Rp"+savings);
    }

    static int calculateSalary(int workHour){
        int salary = 0;
        int normalRate = 15000;
        if (1 <= workHour && workHour <= 40)
            salary = workHour * normalRate;
        else if (workHour > 40)
            salary = (normalRate*40) + (int) ((workHour-40) * normalRate*1.5);

        return salary;
    }

    static String saveMoneyMessage(int moneyIncome, int moneySpending) {
        String message;
        if (moneyIncome > moneySpending)
            message = "Bisa menabung";
        else if (moneyIncome == moneySpending)
            message = "Tidak bisa menabung";
        else
            message = "Cari tambahan";

        return message;
    }

    static int calculateAmountSaving(int moneyIncome, int moneySpending) {
        int moneySaving;
        if (moneyIncome > moneySpending)
            moneySaving = moneyIncome - moneySpending;
        else
            moneySaving = 0;

        return moneySaving;
    }


}
