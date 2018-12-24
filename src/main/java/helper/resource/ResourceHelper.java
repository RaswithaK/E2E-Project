package helper.resource;

public class ResourceHelper {
public static String getResourcePath(String path)
{
	String basepath=System.getProperty("user.dir");
	return basepath+path;
}
public static void main(String[] args)
{
	String path=ResourceHelper.getResourcePath("src/main/java/resources/data.properties");
	System.out.println(path);
}
}
