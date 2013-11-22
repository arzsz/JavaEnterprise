package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Camera;

@ApplicationScoped
public class CameraMenager {

	private List<Camera> db = new ArrayList<Camera>();

	public void addCamera(Camera camera){
		Camera newCamera = new Camera();
		
		newCamera.setName(camera.getName());
		newCamera.setBrand(camera.getBrand());
		newCamera.setDateOfProd(camera.getDateOfProd());
		newCamera.setWeight(camera.getWeight());
		newCamera.setHD(camera.isHD());
		newCamera.setAmount(camera.getAmount());
		
		db.add(newCamera);
	}
	
	// Removes the camera with given name
		public void deleteCamera(Camera camera) {
			Camera cameraToRemove = null;
			for (Camera c : db) {
				if (camera.getName().equals(c.getName())) {
					cameraToRemove = c;
					break;
				}
			}
			if (cameraToRemove != null)
				db.remove(cameraToRemove);
		}
		
		// Find the camera with given attribute
				public void findCamera(Camera camera) {
					Camera cameraToFind = null;
					for (Camera c : db) {
						if (camera.getName().equals(c.getName())) {
							cameraToFind = c;
							break;
						}
					}
					if (cameraToFind != null)
					//return cameraToFind;
				}

		public List<Camera> getAllCameras() {
			return db;
		}
}
