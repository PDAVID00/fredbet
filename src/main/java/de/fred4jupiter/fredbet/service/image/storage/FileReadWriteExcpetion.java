package de.fred4jupiter.fredbet.service.image.storage;

public class FileReadWriteExcpetion extends RuntimeException {

	public FileReadWriteExcpetion(String message) {
		super(message);
	}

	public FileReadWriteExcpetion(String message, Throwable cause) {
		super(message, cause);
	}

}
