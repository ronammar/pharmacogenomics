package pgx;

/**
 * Disclaimer for the pharmacogenomics app.
 * Disclaimer has been adapted from PharmGKB (http://www.pharmgkb.org/page/policies).
 * 
 * @author rammar
 */
public class PGXDisclaimer {
	
	private static final String DISCLAIMER= 
		"This data is provided \"as is\", \"where is\" and without any express or implied warranties, including, but not limited to, any implied warranties of merchantability and/or fitness for a particular purpose. In no event shall The University of Toronto, nor its agents, employers or representatives be liable for any direct, indirect, incidental, special, exemplary, or consequential damages (including, but not limited to, procurement of substitute goods or services; loss of use, data, or profits; or business interruption) however caused and on any theory of liability, whether in contract, strict liability, or tort (including negligence or otherwise) arising in any way or form out of the use of this data, even if advised of the possibility of such damage. All users assume the risk and responsibility for the accuracy, completeness or usefulness, or lack thereof, of any information, apparatus, product or process disclosed or that the use hereof would or would not infringe the rights of any other party.";
	
	/**
	 * Get the PGx app disclaimer.
	 * @return the disclaimer String.
	 */
	public static String getDisclaimer() {
		return DISCLAIMER;
	}
}
