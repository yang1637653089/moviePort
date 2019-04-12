package cn.bdqn.moviePort.tools;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

public class PhotoPath {

    public static File generateFile(String fileName, HttpServletRequest request){
        //File.separator
        File file=generateDirectory(fileName,request);
        if(!file.exists())file.mkdirs();
        return new File(file,generateFileName(fileName));
    }

    private static File generateDirectory(String fileName, HttpServletRequest request){
        String directoryPath = request.getServletContext().getRealPath("/statics/upload/userPhoto");
        return new File(directoryPath);
    }
    private static String generateFileName(String fileName){
        return UUID.randomUUID().toString().replace("-","")+"_"+fileName;
    }
}