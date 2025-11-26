package Team.ControlAccount;

public class PrintAccountList {
    public void printList(AccountFormat[] Account, int j)	{
        for (int k = 0; k < j; k++)
        {
            System.out.printf("%-10s %-5s %d\n", Account[k].getAccountNumber(),
                    Account[k].getAccountName(),
                    Account[k].getMoney());
        }
    }
}