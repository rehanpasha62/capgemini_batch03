package com.tns.abstraction;

abstract class Filecompressor{
	abstract void compress(String filename);
	void showdetails() {
		System.out.println("compress started");
	}
}
class ZipFilecompressor extends Filecompressor{

	@Override
	void compress(String filename) {
		System.out.println("compressing using zip");
		int orginalsize=100;
		int compressedsize=orginalsize*50/100;
		System.out.println("orginal size"+orginalsize+"MB");
		System.out.println("compressed size"+compressedsize+"MB");
		
	}
	
}
class Gzipcompressor extends Filecompressor{

	@Override
	void compress(String filename) {
		System.out.println("compressing using zip");
		int orginalsize=100;
		int compressedsize=orginalsize*50/100;
		System.out.println("orginalsize"+orginalsize+"MB");
		System.out.println("compressedsize"+compressedsize+"Mb");
		
	}
	
}
public class CompressionApp {

    public static void main(String[] args) {

        ZipFilecompressor zip = new ZipFilecompressor();

        zip.showdetails();
        zip.compress("movie.mp4");

        System.out.println();

        Gzipcompressor gzip = new Gzipcompressor();

        gzip.showdetails();
        gzip.compress("document.pdf");
    }
}