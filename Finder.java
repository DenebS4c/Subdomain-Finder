/*
# [+]==================[Creditos]==================[+]
#  #                                                #
#  #     Devs: Ghosty / xNullCode / Deneb           #
#  #     Discord:                                   #
#  #        Deneb007,#6666                          #
#  #     Derechos de Author:                        #
#  #         Ghosty / xNullCode / Deneb             #
# [+]==================[Creditos]==================[+]




# [+]==================[Start Code]==================[+]
*/

package Subdomain.finder;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

public class Finder {
	
	public static Scanner scan = new Scanner(System.in);
	
	public final class Colores {
	    

		  public static final String ANSI_RESET = "\u001B[0m";
		  public static final String ANSI_BLACK = "\u001B[30m";
		  public static final String ANSI_RED = "\u001B[31m";
		  public static final String ANSI_GREEN = "\u001B[32m";
		  public static final String ANSI_YELLOW = "\u001B[33m";
		  public static final String ANSI_BLUE = "\u001B[34m";
		  public static final String ANSI_PURPLE = "\u001B[35m";
		  public static final String ANSI_CYAN = "\u001B[36m";
		  public static final String ANSI_WHITE = "\u001B[37m";

	}
	
	static void Clear() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
	
	public static void Banner() throws IOException, InterruptedException {
		Clear();
		System.out.println(Colores.ANSI_RED+"oo                                        \r\n"
				+ "   oo     OOOOOOOO:       OOOOOOOO!       \r\n"
				+ "      oOOOO!!!!;;;;O    OO.......:;!O     \r\n"
				+ "     'OOO!!!;;;;;;;;O  O.......:   ;!O    \r\n"
				+ "     OOO!!!!;;::::::.OO........:    ;!O   \r\n"
				+ "     OO!!!!;;:::::..............:   ;!O   \r\n"
				+ "     OOO!!!;::::::..............:   ;!O   \r\n"
				+ "      OO!!;;::::::.............:   ;!O    \r\n"
				+ "       OO!;;::::::......oo.....::::!O     \r\n"
				+ "         O!!;::::::........oo..:::O       \r\n"
				+ "           !!!;:::::..........ooO         \r\n"
				+ "              !!;:::::.......O   oo       \r\n"
				+ "                ;;::::.....O        oo  ,o\r\n"
				+ "                   :::..O              ooo\r\n"
				+ "                     ::.              oooo\r\n"
				+ "                      :                "
				+ "\n\n"
				+ Colores.ANSI_WHITE+"          [ "+Colores.ANSI_RED+"Maded By DenebS4c <3 "+Colores.ANSI_WHITE+"]\n");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Banner();
		
		System.out.print(Colores.ANSI_WHITE+"["+Colores.ANSI_CYAN+"   Domain   "+Colores.ANSI_WHITE+"] ? "+Colores.ANSI_CYAN);
		String domain = scan.nextLine();
		System.out.println();
		System.out.println(Colores.ANSI_WHITE+"["+Colores.ANSI_CYAN+"   Searching Domains Of "+domain+"   "+Colores.ANSI_WHITE+"]");
		System.out.println();
		
		String[] subdomains = {"backup3", "backup2", "backup", "npre", "sa", "na", "proxy6", "proxy5", "proxy4", "proxy3", "proxy2", "proxy1", "proxy", "premium", "nopremium", "np2", "np", "www","scrub","spark","uhc", "serieyt", "shop", "report", "apply", "youtube", "twitter", "st", "lost", "sg", "srvc1","srvc2","srvc3","srvc4", "torneo", "serv11", "serv0", "serv10", "serv9", "serv7", "serv6", "serv5", "serv4", "serv3", "serv2", "serv1", "serv", "mcp", "paysafe", "mu", "radio", "donate", "vps03", "vps02", "vps01", "xenon", "radio", "bans", "ns2", "ns1", "donar", "radio", "new", "appeals", "reports", "translations", "marketing", "staff", "bugs", "help", "render", "foro", "ts3", "git", "analytics", "coins", "votos", "docker-main", "main", "server3", "cdn", "creativo", "yt2", "yt", "factions", "solder", "test1", "test001", "testpene", "test", "panel", "apolo", "sv3", "sv2", "sv1", "backups", "zeus", "thor", "vps", "build", "web", "dev", "staff", "mc", "play", "sys", "node1", "node2", "node3", "node4", "node5", "node6", "node7", "node8", "node9", "node10", "node11", "node12", "node13", "node14", "node15", "node16", "node17", "node18", "node19", "node20", "node001", "node002", "node01", "node02", "node003", "sys001", "sys002", "go", "admin", "eggwars", "bedwars", "lobby1", "hub", "builder", "developer", "test1", "forum", "bans", "baneos", "ts", "sys1", "sys2", "mods", "bungee", "bungeecord", "array", "spawn", "help", "client", "api", "smtp", "s1", "s2", "s3", "s4", "server1", "server2", "jugar", "login", "mysql", "phpmyadmin", "demo", "na", "eu","sa", "us", "es", "fr", "it", "ru", "support", "developing", "discord", "backup", "buy", "buycraft", "go", "dedicado1", "dedi", "dedi1", "dedi2", "dedi3", "minecraft", "prueba", "pruebas", "ping", "register", "cdn", "stats", "store", "serie", "buildteam", "info", "host", "jogar", "proxy", "vps", "ovh", "partner", "partners", "appeals", "appeal", "store-assets", "builds", "testing", "server", "pvp", "skywars", "survival", "skyblock", "lobby", "hg", "games", "sys001", "sys002", "node001", "node002", "games001", "games002", "game001", "game002", "game003", "sys001", "us72", "us1", "us2", "us3", "us4", "us5", "goliathdev", "staticassets", "rewards", "rpsrv", "ftp", "ssh", "web", "jobs", "render", "hcf", "grafana", "vote2", "file", "sentry", "enjin", "webserver", "xen", "mco", "monitor", "servidor2", "sadre", "gamehitodrh","dev321","dev123", "rcon"};
		
		for(int i = 0; i<subdomains.length; i++) {
			String subdomains1 = subdomains[i];
			try {
				InetAddress addr = InetAddress.getByName(subdomains1+"."+domain);
				System.out.println(Colores.ANSI_WHITE +"[ "+Colores.ANSI_GREEN+"Found "+Colores.ANSI_WHITE+"] "+Colores.ANSI_CYAN+addr);
			} catch(Exception e) {}
			
		}
		System.out.println();
		System.out.println(Colores.ANSI_WHITE+"[   "+Colores.ANSI_CYAN+"Finished   "+Colores.ANSI_WHITE+"]");
		  
	}

}
/*




# [+]==================[End Code]==================[+]
*/