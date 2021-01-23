package utils.find_duplicate;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/12/28 19:53
 */
public class FileProperty {
    private String filePath;
    private String fileName;
    private String fileMD5;
    private long fileSize;

    public FileProperty(String path) {
        fileName = path.substring(path.lastIndexOf(File.separator) + 1);
        filePath = path.substring(0, path.lastIndexOf(File.separator));
        fileSize = new File(path).length();

        try {
            FileInputStream fis = new FileInputStream(path);
            fileMD5 = DigestUtils.md5Hex(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

/**下面这样的方式无法删除文件，猜测是因为没有主动释放 流*/
/*        try {
            fileMD5 = DigestUtils.md5Hex(new FileInputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    @Override
    public boolean equals(Object o1) {
        boolean re = false;
        FileProperty o = (FileProperty) o1;
        if (o.getFileMD5().equals(fileMD5) ||
                o.getFileName().equals(fileName) ||
                o.getFileSize() == fileSize) {
            re = true;
        }
        return re;
    }

    @Override
    public String toString() {
        return filePath + "\\" + fileName;
    }

    public String getFileMD5() {
        return fileMD5;
    }

    public void setFileMD5(String fileMD5) {
        this.fileMD5 = fileMD5;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }
}
