// 2125 Number of Laser Beams in a Bank
public class Solution {
    public int NumberOfBeams(string[] bank) {
        List<int> laserList=new List<int>();
        for(int i=0;i<bank.Length;i++)
        {
            int currentLaserCount=0;
            for(int j=0;j<bank[i].Length;j++)
            {
                if(bank[i][j]=='1')
                {
                    currentLaserCount++;
                }
            }
            if(currentLaserCount!=0)
            {
                laserList.Add(currentLaserCount);
            }
        }
        if(laserList.Count<=1)
        {
            return 0;
        }
        int result=0;
        for(int i=1;i<laserList.Count;i++)
        {
            result+=(laserList[i]*laserList[i-1]);
        }
        return result;
    }
}