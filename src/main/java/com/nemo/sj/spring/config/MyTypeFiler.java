package com.nemo.sj.spring.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * create by Nemo
 * 2018/9/17  11:06
 */
public class MyTypeFiler implements TypeFilter {
    /**
     *
     * @param metadataReader   读取到的当前正在扫描的类的信息
     * @param metadataReaderFactory     factory for obtaining metadata readers
     * 	 * for other classes (such as superclasses and interfaces)
     *
     * @return
     * @throws IOException
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        // 获取当前类注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();


        // 获取当前正在扫描的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        // 获取当前类资源（类的路径）
        Resource resource = metadataReader.getResource();


        String className = classMetadata.getClassName();
        System.out.println("--->"+className);
//        if (className.equalsIgnoreCase("com.nemo.sj.spring.controller.BookController"))return true;

        return false;
    }
}
