import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) throws IOException {
        // 1. 创建输入流和输出流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("窗里窗外.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("窗里窗外.txt"));
        byte[] buffer = new byte[1024];
        int len = 0;
        
        while((len = bis.read(buffer)) != -1){
            bos.write(buffer,0,len);
        }
        bis.close();
        bos.close();
    }
}
