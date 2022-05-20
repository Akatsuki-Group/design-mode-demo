package org.example.visitor.demo;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}