package com.haitaiinc.interfaceserver;

import java.sql.Connection;

public class ManageMedicalOrderReport {

	private Connection hisdb = null;
	private Connection emrdb = null;
		
		public ManageMedicalOrderReport(Connection hisdb,Connection emrdb)throws Exception {
			if (hisdb == null||emrdb==null ) {
				throw new Exception("Òì³£²ÎÊý");
			}
			this.hisdb = hisdb;
			this.emrdb=emrdb;
		}
		public void MedicalOrderReport() throws Exception {
		}
}
