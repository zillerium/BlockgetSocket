import java.io.*;

public class FileSplit {

    public static void main(String[] args) {

        String input_path = "./";
        String output_path = "./";

    	InputStream inputStream = null;
    	try 
   	{
        	inputStream = new FileInputStream(input_path + "terms.pdf");
    	    	byte[] buffer = new byte[8192];
		byte[][] allbyte=new byte[100][8192];
    		ByteArrayOutputStream baos = new ByteArrayOutputStream();
     		ByteArrayOutputStream ba = new ByteArrayOutputStream();

    		int bytesRead;
		int i=0;
    		while ((bytesRead = inputStream.read(buffer)) != -1)
    		{
      			baos.write(buffer, 0, bytesRead);
			ba.write(buffer,0,bytesRead);
			allbyte[i][] = buffer;
			ba.reset();
			i++;
    		}
		byte b [] = baos.toByteArray();
		// b.length array length
		System.out.println("size page " + b.length);
	        for(int x = 0; x < 1000; x++) {
                	System.out.print((char)b[x]);
                }
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );

    		for(int x=0;x<(i-1);x++) {
			outputStream.write( allbyte[x][] );
		}

		byte c[] = outputStream.toByteArray( );

		OutputStream os = new FileOutputStream("./termsout.pdf");

                // Starts writing the bytes in it
                os.write(b);
                System.out.println("Successfully"
                               + " byte inserted");

                // Close the file
                os.close();
  		OutputStream os1 = new FileOutputStream("./termsout1.pdf");

                // Starts writing the bytes in it
                os1.write(c);
                System.out.println("Successfully"
                               + " byte inserted");

                // Close the file
                os1.close();


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
                if (inputStream != null ) {
                    try {
            		inputStream.close();
        	     } catch (IOException ex) {
            // ignore ... any significant errors should already have been
            // reported via an IOException from the final flush.
        	     }
		}
         }  
    }
}