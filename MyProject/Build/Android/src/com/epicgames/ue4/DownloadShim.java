package com.epicgames.ue4;

import com.dbaby.doomdance.OBBDownloaderService;
import com.dbaby.doomdance.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

