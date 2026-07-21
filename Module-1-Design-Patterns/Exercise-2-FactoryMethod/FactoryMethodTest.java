/**
 * FactoryMethodTest Class
 * 
 * Test class to demonstrate the Factory Method Design Pattern.
 * This class showcases:
 * 1. Creating different document types using the factory
 * 2. Operating on different document types polymorphically
 * 3. The benefits of encapsulation and decoupling
 * 
 * @author Cognizant Digital Nurture
 * @version 1.0
 */
public class FactoryMethodTest {
    
    public static void main(String[] args) {
        System.out.println("=== Factory Method Design Pattern Demo ===\n");
        
        // Create and process a Word document
        System.out.println("--- Creating Word Document ---");
        Document wordDoc = DocumentFactory.createDocument("WORD");
        processDocument(wordDoc);
        System.out.println();
        
        // Create and process a PDF document
        System.out.println("--- Creating PDF Document ---");
        Document pdfDoc = DocumentFactory.createDocument("PDF");
        processDocument(pdfDoc);
        System.out.println();
        
        // Create and process an Excel document
        System.out.println("--- Creating Excel Document ---");
        Document excelDoc = DocumentFactory.createDocument("EXCEL");
        processDocument(excelDoc);
        System.out.println();
        
        // Demonstrate polymorphism with different file type variations
        System.out.println("--- Creating DOCX (Word variant) ---");
        Document docxDoc = DocumentFactory.createDocument("DOCX");
        processDocument(docxDoc);
        System.out.println();
        
        System.out.println("--- Creating XLSX (Excel variant) ---");
        Document xlsxDoc = DocumentFactory.createDocument("XLSX");
        processDocument(xlsxDoc);
        System.out.println();
        
        // Demonstrate error handling
        System.out.println("--- Attempting to create invalid document type ---");
        try {
            Document invalidDoc = DocumentFactory.createDocument("INVALID");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    
    /**
     * Helper method to process a document.
     * Demonstrates polymorphism - the same method works for all document types.
     * 
     * @param document The document to process
     */
    private static void processDocument(Document document) {
        document.open();
        document.generateContent();
        document.save();
        document.close();
    }
}
