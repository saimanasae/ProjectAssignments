package AssistedProjects;


		import java.util.Scanner;

		public class LongestIncSebsequence {

				
				//As a developer, write a Java code to find the longest increasing subsequence from a list of random numbers //

				    public int[] lis(int[] X)
				    {        
				        int n = X.length - 1;
				        int[] M = new int[n + 1];  
				        int[] P = new int[n + 1]; 
				        int L = 0;
				 
				        for (int i = 1; i < n + 1; i++)
				        {
				            int j = 0;
				 
				            /** Linear search applied here. Binary Search can be applied too.**/
				 
				            for (int pos = L ; pos >= 1; pos--)
				            {
				                if (X[M[pos]] < X[i])
				                {
				                    j = pos;
				                    break;
				                }
				            }            
				            P[i] = M[j];
				            if (j == L || X[i] < X[M[j + 1]])
				            {
				                M[j + 1] = i;
				                L = Math.max(L,j + 1);
				            }
				        }
				 
				        /** backtrack **/
				 
				        int[] result = new int[L];
				        int pos = M[L];
				        for (int i = L - 1; i >= 0; i--)
				        {
				            result[i] = X[pos];
				            pos = P[pos];
				        }
				        return result;             
				    }
				 
				    /** Main Function **/
				    public static void main(String[] args) 
				    {    
				        Scanner scan = new Scanner(System.in);
				        System.out.println("Longest Increasing Subsequence Algorithm Test\n");
				 
				        System.out.println("Enter number of elements");
				        int n = scan.nextInt();
				        int[] arr = new int[n + 1];
				        System.out.println("\nEnter "+ n +" elements");
				        for (int i = 1; i <= n; i++)
				            arr[i] = scan.nextInt();
				 
				        LongestIncSebsequence obj = new LongestIncSebsequence(); 
				        int[] result = obj.lis(arr);       
				 
				        /** print result **/ 
				 
				        System.out.print("\nLongest Increasing Subsequence : ");
				        for (int i = 0; i < result.length; i++)
				            System.out.print(result[i] +" ");
				        System.out.println();
				    }
			}

