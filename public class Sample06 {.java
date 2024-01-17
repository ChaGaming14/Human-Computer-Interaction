public class Sample06 {

    public static void main(String[] args) {
        int hCode, gCode, tDays;
        String tName;
        double Tfee;
        String hName[]={"", "In Sugar Hotel","Butong Hotel"," Apo Hotel"};
        String gName[]={"", "JaneBond","SylvicRambo","DiegoSilang","SabelLopez"};
        double rday[] = {0,1106.00, 930.90, 920.30, 1107.00};
                Scanner sc = new Scanner(System.in);
                System.out.println("Tourist Name");
                tName = sc.nextLine();
                System.out.println("Hotel code : (1, 2, 3,)");
                hCode = sc.nextInt();
                System.out.println("Guide code : (1, 2, 3, 4)");
                gCode = sc.nextInt();
                System.out.println("Tour Days : (1, 2, 3, 4, 5, 6, 7, 8, 9)");
                tDays = sc.nextInt();
                Tfee = rday[gCode] * tDays ;
                
                System.out.println("Tourism name" + tName);
                System.out.println("Hotel:"+ hName[hCode]);
                System.out.println("Guide Name" + gName[gCode]);
                System.out.println("Tour Days" + tDays);
                System.out.println("RatePerDay" + rday[gCode]);
                System.out.println("TotalCost" + Tfee);
                
    }
    
    
}

