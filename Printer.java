import java.util.*;

public class Printer {

    static char bg= '=';
    static char color = '#';
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numerical String for Printing...");
        String s = sc.next();
        
        System.out.println("Enter Size");
        int size = sc.nextInt();

        System.out.println("Enter Background Character...");
        bg = sc.next().charAt(0);
        
        System.out.println("Enter Main Character...");
        color = sc.next().charAt(0);
        
        for(int i=1;i<=7;i++)
        {
            for(int k=0;k<size;k++)
            {
                for(int j=0;j<s.length();j++)
                {
                
                    if(s.charAt(j)== '0')
                    {
                        zero(i,size);
                    }
                    else if(s.charAt(j)== '1')
                    {
                        one(i,size);    
                    }
                    else if(s.charAt(j)== '2')
                    {
                        two(i,size);    
                    }
                    else if(s.charAt(j)== '3')
                    {
                        three(i,size);    
                    }
                    else if(s.charAt(j)== '4')
                    {
                        four(i,size);    
                    }
                    else if(s.charAt(j)== '5')
                    {
                        five(i,size);    
                    }
                    else if(s.charAt(j)== '6')
                    {
                        six(i,size);    
                    }
                    else if(s.charAt(j)== '7')
                    {
                        seven(i,size);    
                    }
                    else if(s.charAt(j)== '8')
                    {
                        eight(i,size);    
                    }
                    else if(s.charAt(j)== '9')
                    {
                        nine(i,size);    
                    }
                    
                }
                
                System.out.println();
                
            }
            
        }
    }
    
    public static void zero(int l,int size){
        
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
        if(l%7 == 0 || l%7==1)
        {
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(4*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
        }
        else
        {
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
    }
    public static void one(int l,int size){
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
        
        if(l%7 == 0)
        {
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(4*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
        }
        else if(l%7 == 2)
        {
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(3*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
        }
        else{
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
        }
        
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
    }
    public static void two(int l,int size){
        
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
        
        if(l%7 == 0)
        {
            for(int k=0;k<(6*size);k++)
            {
                System.out.print(color);
            }
        }
        else if(l%7 == 1)
        {
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(4*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
        }
        else if(l%7 == 2)
        {
            
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        else if(l%7 == 3)
        {
            
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        else if(l%7 == 4)
        {
            
            for(int k=0;k<(3*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
        }
        else if(l%7 == 5)
        {
            
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
        }
        else if(l%7 == 6)
        {
            
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(3*size);k++)
            {
                System.out.print(bg);
            }
        }
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
    }
    public static void three(int l,int size){
        
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
        
        if(l%7 == 0 || l%7==1)
        {
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(4*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
        }
        else if(l%7 == 2 || l%7 == 6)
        {
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        else if(l%7 == 3 || l%7 == 5)
        {
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        else
        {
            for(int k=0;k<(3*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
        }
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
    }
    public static void four(int l,int size){
        
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
        
        if(l%7 == 1)
        {
            for(int k=0;k<(3*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(3*size);k++)
            {
                System.out.print(color);
            }
        }
        else if(l%7 == 2)
        {
            
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        else if(l%7 == 3)
        {
            
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        else if(l%7 == 4)
        {
            
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        else if(l%7 == 5)
        {
            
            for(int k=0;k<(6*size);k++)
            {
                System.out.print(color);
            }
        }
        else
        {
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
        
    }
    public static void five(int l,int size){
        
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
        
        if(l%7 == 0)
        {
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(4*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
        }
        else if(l%7 == 1)
        {
            
            for(int k=0;k<(6*size);k++)
            {
                System.out.print(color);
            }
        }
        else if(l%7 == 4)
        {
            
            for(int k=0;k<(5*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
        }
        else if(l%7 == 2 || l%7 == 3)
        {
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
        }
        else if(l%7 == 5)
        {
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        else if(l%7 == 6)
        {
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
        
    }
    public static void six(int l,int size){
        
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
        
        if(l%7 == 0 || l%7==1)
        {
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(4*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
        }
        else if(l%7 == 2 || l%7 == 5 || l%7 == 6)
        {
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        else if(l%7==4)
        {
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(4*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
        }
        else if(l%7==3)
        {
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
        }
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
    }
    public static void seven(int l,int size){
        
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
        
        if(l%7 == 1)
        {
            for(int k=0;k<(6*size);k++)
            {
                System.out.print(color);
            }
        }
        else if(l%7 == 2)
        {
            
            for(int k=0;k<(4*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        else if(l%7 == 3)
        {
            for(int k=0;k<(3*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
        }
        else if(l%7 == 4)
        {
            
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
        }
        else
        {
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(3*size);k++)
            {
                System.out.print(bg);
            }
        }
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
    }
    public static void eight(int l,int size){
        
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
        
        if(l%7 == 0 || l%7==1 || l%7==4)
        {
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(4*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
        }
        else
        {
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
    }
    public static void nine(int l,int size){
        
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
        
        if(l%7 == 0 || l%7 == 1)
        {
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(4*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
        }
        else if(l%7 == 4)
        {
            
            for(int k=0;k<(1*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(5*size);k++)
            {
                System.out.print(color);
            }
        }
        else if(l%7 == 2 || l%7 == 3 || l%7 == 6)
        {
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        else if(l%7 == 5)
        {
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(bg);
            }
            for(int k=0;k<(2*size);k++)
            {
                System.out.print(color);
            }
        }
        for(int k=0;k<(2*size);k++)
        {
            System.out.print(bg);
        }
    }
}
 