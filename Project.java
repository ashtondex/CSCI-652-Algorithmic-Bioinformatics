public class Project
{
    public static void main(String[] args)
    {
        String test1 ="TTCTGATGACTAACTGGACTGA";
        System.out.print(test1.length());
        String test2 ="TTCCG-----TAGCTGGACAGA";
        
        String species1 = test1.toUpperCase();
        String species2 = test2.toUpperCase();
        
        //int count =0;

        int indelCount=0,subCount=0,transCount=0,verseCount=0,matches =0,mismatches=0;

        for (int i = 0; i<species1.length();i++)
        {
           if (species1.charAt(i) == species2.charAt(i))
           {
               matches += 1;
           }
        
           if (species1.charAt(i) != species2.charAt(i) && species1.charAt(i) != '-' && species2.charAt(i) != '-')
           {
               mismatches += 1;
           }
           
           if (species1.charAt(i) == '-' || species2.charAt(i) == '-')
           {
               indelCount += 1;
           }
           
           else if (species1.charAt(i) == 'A' && species2.charAt(i) == 'G' || species1.charAt(i) == 'G' && species2.charAt(i) == 'A' || species1.charAt(i) == 'C' && species2.charAt(i) == 'T' || species1.charAt(i) == 'T' && species2.charAt(i) == 'C')
           {
                transCount += 1;
           }
           
           verseCount = mismatches - transCount;
           
          
        }
        System.out.println("Matches are "+matches);
        System.out.println("MisMatches are "+mismatches);
        System.out.println("Indels are "+indelCount);
        System.out.println("Transitions are "+transCount);
        System.out.println("Transversions are "+verseCount);
        
    }
}