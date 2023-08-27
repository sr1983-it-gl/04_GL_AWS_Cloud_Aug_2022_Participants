package com.samples.services.repository;

import java.util.ArrayList;
import java.util.List;

import com.samples.services.entity.ServiceEntity;

public class ServiceRepository {

	static List<ServiceEntity> allEntities = new ArrayList<>();
	
	static {
		
		allEntities.add(new ServiceEntity(
				1L, "ECS", "Elastic Container Service", "cluster, task definitions"));
		
		allEntities.add(new ServiceEntity(
				2L, "AWS-CC", "AWS Code Commit", "repository, commit"));
		
		allEntities.add(new ServiceEntity(
				3L, "RDS", "Relational Database Service", "database, sql, schema, backup"));
		
		allEntities.add(new ServiceEntity(
				4L, "ELB", "Elastic Load Balancer", "auto-scaling, target groups, listeners"));

		allEntities.add(new ServiceEntity(
				5L, "ECS", "Elastic Container Service", "task, cluster, task-definitions"));

		allEntities.add(new ServiceEntity(
				6L, "S3", "Simple Storage Service", "storage, object storage, buckets"));

		allEntities.add(new ServiceEntity(
				7L, "EC2", "Elastic Compute Cloud", "virutal machines, instance-types"));		

		allEntities.add(new ServiceEntity(
				8L, "EBStore", "Elastic Block Store", "volume, file-system, snap-shots"));		
		
		allEntities.add(new ServiceEntity(
				9L, "EBS", "Elastic Beanstalk", "application, environment, deploy"));	
		
		allEntities.add(new ServiceEntity(
				10L, "AWS-CP", "AWS Code Pipeline", "deploy, ci-cd, automation"));				
	}
	
	public List<ServiceEntity> listAll(){
		return allEntities;
	}
	
	public ServiceEntity findByCode(String serviceCode) {
		
		for (ServiceEntity se : listAll()) {
			
			if  (serviceCode.equalsIgnoreCase(se.getCode())) {
				return se;
			}
		}		
		return null;
	}
}
