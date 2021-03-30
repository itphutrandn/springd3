package edu.vinaenter.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import edu.vinaenter.constants.GlobalConstant;

public class FileUtil {
	
	public static String upload(MultipartFile file) {
		if (file != null) {
			if (!GlobalConstant.EMPTY.equals(file.getOriginalFilename())) {
				String userDir = System.getenv(GlobalConstant.ENV_PATH_PROJECT);
				System.out.println("User dir :"+userDir);
				String dirPath = userDir + File.separator + GlobalConstant.DIR_UPLOAD;
				File saveDir = new File(dirPath);
				if (!saveDir.exists()) {
					saveDir.mkdirs();
				}
				String fileName = rename(file.getOriginalFilename());
				String filePath = dirPath + File.separator + fileName;
				System.out.println("filePath :"+filePath);
				try {
					file.transferTo(new File(filePath));
				} catch (IllegalStateException | IOException e) {
					e.printStackTrace();
				}
				return fileName;
			}
		}
		return GlobalConstant.EMPTY;
	}
	
	public static String rename(String fileName) {
		if (!GlobalConstant.EMPTY.equals(fileName)) {
			StringBuilder sb = new StringBuilder();
			sb.append(FilenameUtils.getBaseName(fileName)).
			append("-").
			append(System.nanoTime()).
			append(".").
			append(FilenameUtils.getExtension(fileName));
			return sb.toString();
		}
		return GlobalConstant.EMPTY;
	}
}
