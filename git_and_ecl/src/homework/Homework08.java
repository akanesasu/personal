package homework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Homework08 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String outerPath = "I:/temp";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmm");
		
		int runtime = 100;

		try {
			for(int i=1;i<=runtime;i++) {
				Date now = new Date();
				String strSdf = sdf.format(now);
				File dateDir = new File(outerPath+"/"+strSdf);
					
				String uuid = UUID.randomUUID().toString();		
				String innerPath = "I:/temp"+"/"+strSdf;
				File uuidDir = new File(innerPath+"/"+uuid);
					
				dateDir.mkdir();
				uuidDir.mkdir();
				Thread.sleep(1*100);
				printProgress(startTime,runtime,i);
			}
		} catch (InterruptedException ie) {}
		System.out.println("============ Process Completed ============");
	} // main

	public static void printProgress(long startTime, long total, long current) {
		long eta = current == 0 ? 0 : (total-current)*(System.currentTimeMillis()-startTime)/current;
		int per = (int) (current * 100 / total);
		
		String etaHms = current == 0 ? "N/A" : String.format("%02d:%02d:%02d:%03d", 
				TimeUnit.MILLISECONDS.toHours(eta), 
				TimeUnit.MILLISECONDS.toMinutes(eta) % TimeUnit.HOURS.toMinutes(1),
				TimeUnit.MILLISECONDS.toSeconds(eta) % TimeUnit.MINUTES.toSeconds(1),
				TimeUnit.MILLISECONDS.toMillis(eta) % TimeUnit.SECONDS.toMillis(1));
		
		if(per==100) {
			System.out.println(String.format("[ %3d%% Processing...] ETA : %s", per, etaHms));
		} else if((int)(Math.random()*7)+1==(int)(Math.random()*7)+1) {
			System.out.println(String.format("[ %3d%% Processing...] ETA : %s", per, etaHms));
		}
	} //printProgress
} // end class