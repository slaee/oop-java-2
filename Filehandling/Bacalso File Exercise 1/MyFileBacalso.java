import java.io.*;

public class MyFileBacalso{
	private File file;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	private FileWriter fileWriter;
	private String line;
	
	public MyFileBacalso(String fileName) {
		file = new File(fileName);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean createFile(String fileName){
		boolean result = false;
		file = new File(fileName);
		try{
			touch(file);
			result = true;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return result;
	}

	public boolean delete(File file){
		boolean result = false;
		try{
			rm(file);
			result = true;
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		return result;
	}

	public boolean isDirectory(File file){
		if(file.isDirectory())
			return true;
		return false;
	}

	public boolean isFile(File fileName){
		if(file.isFile())
			return true;
		return false;
	}

	public boolean readFromFile(String filename){
		boolean result = false;
		try{
			fileReader = new FileReader(filename);
			bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			while(line != null){
				this.line = line;
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
			fileReader.close();
			result = true;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
		return result;
	}

	public boolean writeToFile(String filename){
		boolean result = false;
		try{
			fileWriter = new FileWriter(filename);
			result = true;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return result;
	}

	public void write(String str){
		try{
			fileWriter.write(str);
			fileWriter.flush();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public String getContent(){
		return line;
	}

	private void touch(File fileName) throws IOException {
		if(!file.createNewFile()){
			throw new IOException("Unable to create file " + fileName);
		}
	}

	private void rm(File file) throws IOException {
		try {
			if(isDirectory(file)){
				rmRecursivePath(file);
			} else {
				file.delete();
			}
		} catch (Exception e){
			throw new IOException(e.getMessage());
		}
	}

	private void rmRecursivePath(File file) throws IOException{
		if(isDirectory(file)){
			File[] files = file.listFiles();
			if(files != null){
				for(File fileEntry : files){
					rmRecursivePath(fileEntry);
				}
			} 
		}

		if(!file.delete()){
			throw new IOException("Failed to delete " + file);
		}
	}
}