public class StudentDriver
{
        public static void main (String[] args)
        {
            GoodStudent alanTuring = new GoodStudent(3.56, "Alan", "Turing", 191254, true);
            GoodStudent florenceNightingale = new GoodStudent(3.89, "Florence", "Nightingale", 182010,false);
            GoodStudent graceHopper = new GoodStudent(3.99, "Grace", "Hopper", 190692, true);

            //toString Alan output
            System.out.println(alanTuring.toString());

            //Florence outputs
            florenceNightingale.setID(95366);
            florenceNightingale.setGPA(3.92);
            System.out.println("Florence Nightingale's ID: " + florenceNightingale.getID());
            System.out.println("Florence Nightingale's GPA: " + florenceNightingale.getGPA());

            //Output Grace’s first name and CS status
            System.out.println("First name: " + graceHopper.getfirstName());
            System.out.println("CS status: " + graceHopper.getCSstudent());

            //CreateID
            System.out.println("\nAlan Turing's ID" + alanTuring.CreateID());
            System.out.println("Florence Nightingale's ID" + florenceNightingale.CreateID());
            System.out.println("Grace Hopper's ID" + graceHopper.CreateID());

            //CSGPA
            System.out.println("\nAlan Turing's CS GPA: " + alanTuring.CSGPA());
            System.out.println("Florence Nightingale's CS GPA: " + florenceNightingale.CSGPA());
            System.out.println("Grace Hopper's CS GPA: " + graceHopper.CSGPA());
        }
    }