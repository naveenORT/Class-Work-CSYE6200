package pythonproject1;

import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Random;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.ServerSocket;

public class PythonServer extends Thread
{
    private final ServerSocket pythonserver;
    String filelocation;
    
    public PythonServer(final int port, final String filelocation) throws IOException {
        this.filelocation = filelocation;
        (this.pythonserver = new ServerSocket(port)).setSoTimeout(10000);
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                final Socket server = this.pythonserver.accept();
                final BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));
                final PrintWriter out = new PrintWriter(server.getOutputStream(), true);
                out.println("Hello there!");
                final Responser hello = new Responser(in.readLine());
                int success = 1;
                if (!hello.helloResponser()) {
                    System.out.println("Hello fails");
                    server.close();
                }
                else {
                    final CheckFile flag = new CheckFile(hello.getUserName(), this.filelocation);
                    final Random randomnum = new Random();
                    for (int times = randomnum.nextInt(101) + 101, i = 0; i < times; ++i) {
                        final Responser math = new Responser();
                        out.println(math.mathQuestionMaker());
                        math.getAnswer(in.readLine());
                        if (!math.mathAnswerJudger()) {
                            System.out.println("Answer is Wrong");
                            server.close();
                            success = 0;
                            break;
                        }
                    }
                    if (success == 0) {
                        break;
                    }
                    out.println("DONE " + flag.hashMaker() + "\n");
                    System.out.println("Successful!");
                    server.close();
                    System.exit(0);
                }
            }
        }
        catch (SocketTimeoutException s) {
            System.out.println("Socket time out!");
        }
        catch (IOException s2) {
            System.out.println("IOException happens");
        }
        catch (Exception e) {
            System.out.println("Exception happens");
        }
    }
    
    public static void main(final String[] args) {
        if (args.length != 1) {
            System.out.println("Please give the right format");
            System.exit(0);
        }
        try {
            final Thread t = new PythonServer(8888, args[0]);
            t.start();
        }
        catch (IOException e) {
            System.out.println("Thread Creation Error");
        }
    }
}
