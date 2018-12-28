
package Lab_6;
import java.util.Scanner;
public class MarksCalculation {
    static Scanner  scanner = new Scanner(System.in) ;
    
    public static void main(String[] args) {
        
        System.out.println("Please, enter the number of subjects : ");
        int nSubjects = scanner.nextInt() ;
        
        int [] marks = new int[nSubjects] ;
        
        System.out.println("Please, enter the subjects marks : ");
        
        for( int  i = 0 ; i < nSubjects ; i++ )
        {
            marks[i] = scanner.nextInt() ;
        }
        
        analyzeTheMarks(marks) ;
        
    }
    
    private static void analyzeTheMarks( int[] marks)
    {
        int nSubjects = marks.length  ;
        int failSubject = 0, totalMarks = 0;
        for( int i = 0 ; i < nSubjects ; i++ )
        {
            int mark = marks[i] ;
            totalMarks += mark ;
            try
            {
                if ( mark < 0 || mark > 100)
                {
                    throw new invalidInputRangeException() ;
                }
                else if( mark < 40)
                {
                    ++failSubject ; // We are assuming that fail marks is below 40 as it is not explicitly mentioned in the question. 
                                            // For assuming this, studentFailedinAllsubjectException will become unreachable as prior to that 
                                            // studentFailedException will be thrown.
                }
            }
            catch( invalidInputRangeException e)
            {
                System.out.println(e);
            }
        }
        
        double average = totalMarks / nSubjects ;
        
        try
        {
            if( average > 95 )
            {
                throw new suspicousOutputException () ;
            } 
            else if( average < 40 )
            {
                throw new studentFailedException () ;
            }
            else if( failSubject == nSubjects)
            {
                throw new studentFailedInAllSubjectException () ;
            }
            else
            {
                System.out.println(average);
            }
        }
        catch( suspicousOutputException  e)
        {
            System.out.println(e);
        }
        catch( studentFailedException  e)
        {
            System.out.println(e);
        }
        catch( studentFailedInAllSubjectException e)
        {
            System.out.println(e);
        }
    } 
}
