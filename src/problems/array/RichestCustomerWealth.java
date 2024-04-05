package problems.array;

//1672. Richest Customer Wealth
public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int iter = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                iter += accounts[i][j];
            }
            if (iter > wealth) {
                wealth = iter;
            }
        }
        return wealth;
    }
}
