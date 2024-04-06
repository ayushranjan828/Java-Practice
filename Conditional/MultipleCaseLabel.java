public class MultipleCaseLabel 
{
        public static void main(String[] args) 
        {
            char a = 'C';
            switch (a)
            {
                case 'B':
                    System.out.println("Letter B");
                case 'b':
                    System.out.println("Letter b");
                    break;
                case 'C':
                    System.out.println("Letter C");
                case 'c':
                    System.out.println("Letter c");
                    break;
                default:
                    System.out.println("Default case: NO Letter Matched!");
            }
        }    
}
