package util;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.test.annotations.WrapToTest;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import model.ConexaoBD;

/**
 * Simple Hello World example.
 */
@WrapToTest
public class GeraPDFUtil {

	public static final String DEST = "c:/PDFs/PDF1.pdf";

	public static void geraPDF(String[] str) throws IOException, SQLException {
		File file = new File(DEST);
		file.getParentFile().mkdirs();
		new GeraPDFUtil().createPdf(DEST, str);
	}

	public void createPdf(String dest, String[] str) throws IOException, SQLException {
		ConexaoBD banco = new ConexaoBD();
		Connection con = banco.iniciaBd();
		banco.executaQuery(str,con);

		// Initialize PDF writer
		PdfWriter writer = new PdfWriter(dest);

		// Initialize PDF document
		PdfDocument pdf = new PdfDocument(writer);

		// Initialize document
		Document document = new Document(pdf);

		// Add paragraph to the document
		document.add(new Paragraph("ABANDONO DE EMPREGO"));
		String stringConstrutor = String.format(
				"A empresa %s, inscrita no CNPJ sob o nº %s, com sede à %s, solicita o comparecimento do(a) funcionário(a) %s, CTPS nº %s, Série %s, para prestar esclarecimentos sobre sua ausência que ocorre desde %s. Seu não comparecimento caracterizará abandono de emprego, conforme artigo 482, alínea \"i\" da CLT.",
				str[0], str[1], str[2], str[3], str[4], str[5], str[6]);
		document.add(new Paragraph(stringConstrutor));
		// Close document
		document.close();

		
	}
}