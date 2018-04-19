import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class StartShowcase {
	
	public static void main(String[] args) throws Exception {
		
		for (int i = 1; i <= 100; i++) {
			URL photos = new URL("https://jsonplaceholder.typicode.com/photos?albumId=" + i);
			URLConnection oc = photos.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(oc.getInputStream()));
			int input = in.read();
			Scanner s = new Scanner(in);
			Album album = new Album();
			if (input > 0) {
				String[] query = photos.getQuery().split("=");
				album.setAlbumId(query[1]);
				System.out.println("Photo album " + album.getAlbumId());

				String inputLine;
				while ((inputLine = in.readLine()) != null) {
					s.next();
					while (s.hasNext()) {
						if (s.next().equals(album.getID_LINE())) {
							album.setId(s.next().replaceAll(",", ""));
							System.out.print("\t[" + album.getId() + "] ");
						}
						if (s.next().equals(album.getTITLE_LINE())) {
							album.setTitle(s.nextLine().replaceAll("\"", "").replaceAll(",", ""));
							System.out.println(album.getTitle());
						}
					}
				}
			}
			System.out.println();
		}
	}
}
