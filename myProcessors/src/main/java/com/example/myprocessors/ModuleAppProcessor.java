package com.example.myprocessors;

import com.example.annolib.BuilderProperty;
import com.example.annolib.ModuleAppAnno;
import com.google.auto.service.AutoService;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;

/**
 * 负责处理 {@link ModuleAppAnno}
 */
@AutoService(Processor.class)
public class ModuleAppProcessor extends AbstractProcessor {


    private Elements mElements;
    private Filer mFiler;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
        mElements = processingEnv.getElementUtils();
        mFiler = processingEnv.getFiler();
    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        System.out.print("process");
        Set<? extends Element> moduleAppElements = roundEnvironment.getElementsAnnotatedWith(ModuleAppAnno.class);
        if(moduleAppElements!=null&&moduleAppElements.size()>0){
            parseAnnotation(moduleAppElements);
            createImpl();
            return true;
        }
        return false;
    }
    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return Collections.singleton(ModuleAppAnno.class.getCanonicalName());
    }
    private void createImpl() {
        String claName="com.example.profilemodule.MouduleGene";
        System.out.print("createImpl");
        TypeSpec typeSpec = TypeSpec.classBuilder(claName).build();
        try {
            JavaFile
                    .builder("com.example.profilemodule", typeSpec)
                    .indent("    ")
                    .build().writeTo(mFiler);
        }catch (Exception e){}

    }

    private List<Element> applicationList = new ArrayList<>();
    private void parseAnnotation(Set<? extends Element> moduleAppElements) {
        for (Element element : moduleAppElements) {
            ModuleAppAnno moduleApp = element.getAnnotation(ModuleAppAnno.class);
            if (moduleApp == null) {
                continue;
            }
            applicationList.add(element);
        }
    }
}
