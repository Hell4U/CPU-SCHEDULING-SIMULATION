/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NEEL
 */
public class LotteryAlgo {
    
    public LotteryAlgo(int[] proc,int[] burst,int[] prio,int zq)
    {
        System.out.print(zq);
    }

    /**
     *
     * @param proc
     * @param burst
     * @param prio
     * @param zq
     * @return 
     */
    static public void fun(int[] proc,int[] burst,int[] prio,int zq)
    {
        int n,i,j,k;
        int time=0,quantom=1,tbt=0;
        int z=0,q=0,temp;
        int pos;
        int[] lottery=new int[zq];
        int[][] ticket=new int[zq][zq];
        for(i=0;i<zq;i++)
        {
            pos=i;
            for(j=i+1;j<zq;j++)
            {
                if(prio[j]<prio[pos])
                    pos=j;
            }

            temp=proc[i];
            proc[i]=proc[pos];
            proc[pos]= temp;

            temp=burst[i];
            burst[i]=burst[pos];
            burst[pos]=temp;

            temp=prio[i];
            prio[i]=prio[pos];
            prio[pos]=temp;
        }
        for(i=0;i<zq;i++)
        {
            tbt=tbt+burst[i];
        }
        int p=1,m_ticket=0;
        for(i=0;i<zq;i++)
            {
                    lottery[i] = (burst[i]/quantom) + (zq-prio[i]);
                    for (z=0;z<lottery[i];z++)
                    {
                ticket[i][z] = p++;
                m_ticket = p;
            }
                    for(z=0;z<lottery[i];z++)
                    {
                        String s1,s2,s3,s4;
                        s1=""+prio[i]; s2=""+proc[i]; s3=""+burst[i]; s4=""+lottery[i];
                        String f=s1+" "+s2+" ";
                    }
            }
    }
}
