package importantQuestions;

public class MergeArrays {

    int mPlusN[];
    int N[];

    public MergeArrays(int[] mPlusN, int[] n) {
        this.mPlusN = mPlusN;
        N = n;
    }

    void moveToEnd(int mPlusN[], int size)
    {
        int i, j = size - 1;
        for (i = size - 1; i >= 0; i--) {
            if (mPlusN[i] != -1) {
                mPlusN[j] = mPlusN[i];
                j--;
            }
        }
    }

    public void merge(int[] mPlusN, int[] N, int m, int n) {
        int i = n;

        /* Current index of i/p part of mPlusN[]*/
        int j = 0;

        /* Current index of N[]*/
        int k = 0;

        /* Current index of output mPlusN[]*/
        while (k < (m + n))
        {
            /* Take an element from mPlusN[] if
            a) value of the picked element is smaller and we
            have not reached end of it b) We have reached
            end of N[] */
            if ((i < (m + n) && mPlusN[i] <= N[j])
                    || (j == n)) {
                mPlusN[k] = mPlusN[i];
                k++;
                i++;
            }
            else // Otherwise take element from N[]
            {
                mPlusN[k] = N[j];
                k++;
                j++;
            }
        }
    }
}
