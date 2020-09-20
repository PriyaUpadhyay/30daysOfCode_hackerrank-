/* Declare second integer, double, and String variables. */
        
        int num2;
        double dob2;
        String str2;
        

        /* Read and save an integer, double, and String to your variables.*/
         
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        num2 = scan.nextInt();
        dob2 = scan.nextDouble();
        str2 = scan.next();
        while(scan.hasNext()){
            str2 = str2 +" "+ scan.next();
        }
        

        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(num2+i);

        /* Print the sum of the double variables on a new line. */
        System.out.println(dob2+d);

		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s+str2);
        //System.out.println(str2);


        scan.close();
