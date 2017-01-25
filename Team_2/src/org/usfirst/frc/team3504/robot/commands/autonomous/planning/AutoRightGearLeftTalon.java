package org.usfirst.frc.team3504.robot.commands.autonomous.planning;

public class AutoRightGearLeftTalon {		
		public static final int kNumPoints =185;		
		// Position (rotations)	Velocity (RPM)	Duration (ms)
		public static double [][]Points = new double[][]{	
			   0.0000000000000000e+00   0.0000000000000000e+00   1.0000000000000000e+01
			   3.9788735772973835e-03   2.3873241463784304e+01   1.0000000000000000e+01
			   1.1936620731892150e-02   4.7746482927568607e+01   1.0000000000000000e+01
			   2.3873241463784306e-02   7.1619724391352918e+01   1.0000000000000000e+01
			   3.9788735772973843e-02   9.5492965855137214e+01   1.0000000000000000e+01
			   5.5704230082163381e-02   9.5492965855137214e+01   1.0000000000000000e+01
			   7.1619724391352918e-02   9.5492965855137214e+01   1.0000000000000000e+01
			   8.7535218700542455e-02   9.5492965855137214e+01   1.0000000000000000e+01
			   1.0345071300973199e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   1.1936620731892153e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   1.3528170162811107e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   1.5119719593730060e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   1.6711269024649014e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   1.8302818455567968e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   1.9894367886486922e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   2.1485917317405875e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   2.3077466748324829e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   2.4669016179243783e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   2.6260565610162734e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   2.7852115041081688e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   2.9443664472000641e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   3.1035213902919595e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   3.2626763333838549e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   3.4218312764757502e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   3.5809862195676456e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   3.7401411626595410e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   3.8992961057514364e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   4.0584510488433317e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   4.2176059919352271e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   4.3767609350271225e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   4.5359158781190179e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   4.6950708212109132e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   4.8542257643028086e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   5.0133807073947034e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   5.1725356504865982e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   5.3316905935784931e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   5.4908455366703879e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   5.6500004797622827e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   5.8091554228541775e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   5.9683103659460723e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   6.1274653090379672e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   6.2866202521298620e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   6.4457751952217568e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   6.6049301383136516e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   6.7640850814055464e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   6.9232400244974412e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   7.0823949675893361e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   7.2415499106812309e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   7.4007048537731257e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   7.5598597968650205e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   7.7190147399569153e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   7.8781696830488102e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   8.0373246261407050e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   8.1964795692325998e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   8.3556345123244946e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   8.5147894554163894e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   8.6739443985082842e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   8.8330993416001791e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   8.9922542846920739e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   9.1514092277839687e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   9.3105641708758635e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   9.4697191139677583e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   9.6288740570596532e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   9.7880290001515480e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   9.9471839432434428e-01   9.5492965855137214e+01   1.0000000000000000e+01
			   1.0106338886335338e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.0265493829427232e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.0424648772519127e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.0583803715611022e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.0742958658702917e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.0902113601794812e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.1061268544886707e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.1220423487978601e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.1379578431070496e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.1538733374162391e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.1697888317254286e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.1857043260346181e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.2016198203438075e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.2175353146529970e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.2334508089621865e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.2493663032713760e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.2652817975805655e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.2811972918897550e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.2971127861989444e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.3130282805081339e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.3289437748173234e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.3448592691265129e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.3607747634357024e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.3766902577448918e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.3926057520540813e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.4085212463632708e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.4244367406724603e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.4403522349816498e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.4562677292908393e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.4721832236000287e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.4880987179092182e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.5040142122184077e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.5199297065275972e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.5358452008367867e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.5517606951459761e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.5676761894551656e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.5835916837643551e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.5995071780735446e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.6154226723827341e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.6313381666919236e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.6472536610011130e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.6631691553103025e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.6790846496194920e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.6950001439286815e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.7109156382378710e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.7268311325470604e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.7427466268562499e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.7586621211654394e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.7745776154746289e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.7904931097838184e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.8064086040930079e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.8223240984021973e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.8382395927113868e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.8541550870205763e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.8700705813297658e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.8859860756389553e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.9019015699481447e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.9178170642573342e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.9337325585665237e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.9496480528757132e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.9655635471849027e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.9814790414940922e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   1.9973945358032816e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.0133100301124713e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.0292255244216610e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.0451410187308507e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.0610565130400404e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.0769720073492302e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.0928875016584199e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.1088029959676096e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.1247184902767993e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.1406339845859890e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.1565494788951787e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.1724649732043684e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.1883804675135581e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.2042959618227478e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.2202114561319375e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.2361269504411272e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.2520424447503169e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.2679579390595066e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.2838734333686963e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.2997889276778860e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.3157044219870757e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.3316199162962654e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.3475354106054551e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.3634509049146448e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.3793663992238345e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.3952818935330242e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.4111973878422139e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.4271128821514036e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.4430283764605933e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.4589438707697830e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.4748593650789728e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.4907748593881625e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.5066903536973522e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.5226058480065419e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.5385213423157316e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.5544368366249213e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.5703523309341110e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.5862678252433007e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.6021833195524904e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.6180988138616801e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.6340143081708698e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.6499298024800595e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.6658452967892492e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.6817607910984389e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.6976762854076286e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.7135917797168183e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.7295072740260080e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.7454227683351977e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.7613382626443874e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.7772537569535771e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.7931692512627668e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.8090847455719565e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.8250002398811462e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.8409157341903359e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.8568312284995256e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.8727467228087153e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.8886622171179051e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.9045777114270948e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.9204932057362845e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.9364087000454742e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.9523241943546639e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.9682396886638536e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   2.9841551829730433e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.0000706772822330e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.0159861715914227e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.0319016659006124e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.0478171602098021e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.0637326545189918e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.0796481488281815e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.0955636431373712e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.1114791374465609e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.1273946317557506e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.1433101260649403e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.1592256203741300e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.1751411146833197e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.1910566089925094e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.2069721033016991e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.2228875976108888e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.2388030919200785e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.2547185862292682e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.2706340805384579e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.2865495748476476e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.3024650691568374e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.3183805634660271e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.3342960577752168e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.3502115520844065e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.3661270463935962e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.3820425407027859e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.3979580350119756e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.4138735293211653e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.4297890236303550e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.4457045179395447e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.4616200122487344e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.4775355065579241e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.4934510008671138e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.5093664951763035e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.5252819894854932e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.5411974837946829e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.5571129781038726e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   3.5690495988357647e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.5809862195676567e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.5929228402995488e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.6048594610314408e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.6167960817633329e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.6287327024952249e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.6406693232271170e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.6526059439590091e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.6645425646909011e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.6764791854227932e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.6884158061546852e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.7003524268865773e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.7122890476184693e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.7242256683503614e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.7361622890822535e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.7480989098141455e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.7600355305460376e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.7719721512779296e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.7839087720098217e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.7958453927417137e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.8077820134736058e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.8197186342054978e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.8316552549373899e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.8435918756692820e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.8555284964011740e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.8674651171330661e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.8794017378649581e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.8913383585968502e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.9032749793287422e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.9152116000606343e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.9271482207925263e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.9390848415244184e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.9510214622563105e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.9629580829882025e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.9748947037200946e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.9868313244519866e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   3.9987679451838787e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.0107045659157707e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.0226411866476628e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.0345778073795548e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.0465144281114469e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.0584510488433390e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.0703876695752310e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.0823242903071231e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.0942609110390151e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.1061975317709072e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.1181341525027992e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.1300707732346913e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.1420073939665834e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.1539440146984754e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.1658806354303675e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.1778172561622595e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.1897538768941516e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.2016904976260436e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.2136271183579357e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.2255637390898277e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.2375003598217198e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.2494369805536119e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.2613736012855039e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.2733102220173960e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.2852468427492880e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.2971834634811801e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.3091200842130721e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.3210567049449642e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.3329933256768562e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.3449299464087483e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.3568665671406404e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.3688031878725324e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.3807398086044245e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.3926764293363165e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.4046130500682086e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.4165496708001006e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.4284862915319927e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.4404229122638847e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.4523595329957768e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.4642961537276689e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.4762327744595609e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.4881693951914530e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.5001060159233450e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.5120426366552371e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.5239792573871291e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.5359158781190212e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.5478524988509132e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.5597891195828053e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.5717257403146974e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.5836623610465894e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.5955989817784815e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.6075356025103735e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.6194722232422656e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.6314088439741576e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.6433454647060497e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.6552820854379418e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.6672187061698338e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.6791553269017259e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.6910919476336179e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.7030285683655100e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.7149651890974020e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.7269018098292941e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.7388384305611861e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.7507750512930782e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.7627116720249703e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.7746482927568623e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.7865849134887544e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.7985215342206464e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.8104581549525385e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.8223947756844305e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.8343313964163226e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.8462680171482146e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.8582046378801067e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.8701412586119988e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.8820778793438908e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.8940145000757829e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.9059511208076749e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.9178877415395670e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.9298243622714590e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.9417609830033511e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.9536976037352431e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.9656342244671352e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.9775708451990273e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   4.9895074659309193e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.0014440866628114e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.0173595809720011e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.0332750752811908e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.0491905695903805e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.0651060638995702e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.0810215582087599e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.0969370525179496e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.1128525468271393e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.1287680411363290e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.1446835354455187e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.1605990297547084e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.1765145240638981e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.1924300183730878e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.2083455126822775e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.2242610069914672e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.2401765013006569e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.2560919956098466e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.2720074899190363e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.2879229842282260e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.3038384785374157e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.3197539728466054e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.3356694671557952e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.3515849614649849e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.3675004557741746e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.3834159500833643e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.3993314443925540e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.4152469387017437e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.4311624330109334e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.4470779273201231e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.4629934216293128e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.4789089159385025e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.4948244102476922e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.5107399045568819e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.5266553988660716e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.5425708931752613e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.5584863874844510e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.5744018817936407e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.5903173761028304e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.6062328704120201e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.6221483647212098e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.6380638590303995e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.6539793533395892e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.6698948476487789e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.6858103419579686e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.7017258362671583e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.7176413305763480e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.7335568248855378e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.7494723191947275e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.7653878135039172e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.7813033078131069e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   5.7932399285449989e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.8051765492768910e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.8171131700087830e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.8290497907406751e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.8409864114725671e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.8529230322044592e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.8648596529363513e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.8767962736682433e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.8887328944001354e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.9006695151320274e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.9126061358639195e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.9245427565958115e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.9364793773277036e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.9484159980595956e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.9603526187914877e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.9722892395233798e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.9842258602552718e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   5.9961624809871639e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.0080991017190559e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.0200357224509480e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.0319723431828400e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.0439089639147321e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.0558455846466241e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.0677822053785162e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.0797188261104083e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.0916554468423003e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.1035920675741924e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.1155286883060844e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.1274653090379765e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.1394019297698685e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.1513385505017606e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.1632751712336526e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.1752117919655447e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.1871484126974368e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.1990850334293288e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.2110216541612209e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.2229582748931129e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.2348948956250050e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.2468315163568970e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.2587681370887891e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.2707047578206812e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.2826413785525732e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.2945779992844653e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.3065146200163573e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.3184512407482494e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.3303878614801414e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.3423244822120335e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.3542611029439255e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.3661977236758176e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.3781343444077097e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.3900709651396017e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.4020075858714938e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.4139442066033858e+00   7.1619724391352918e+01   1.0000000000000000e+01
			   6.4298597009125755e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.4457751952217652e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.4616906895309549e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.4776061838401446e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.4935216781493343e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.5094371724585240e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.5253526667677137e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.5412681610769035e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.5571836553860932e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.5730991496952829e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.5890146440044726e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.6049301383136623e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.6208456326228520e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.6367611269320417e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.6526766212412314e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.6685921155504211e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.6845076098596108e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.7004231041688005e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.7163385984779902e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.7322540927871799e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.7481695870963696e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.7640850814055593e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.7800005757147490e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.7959160700239387e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.8118315643331284e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.8277470586423181e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.8436625529515078e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.8595780472606975e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.8754935415698872e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.8914090358790769e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.9073245301882666e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.9232400244974563e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.9391555188066461e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.9550710131158358e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.9709865074250255e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   6.9869020017342152e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   7.0028174960434049e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   7.0187329903525946e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   7.0346484846617843e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   7.0505639789709740e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   7.0664794732801637e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   7.0823949675893534e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   7.0983104618985431e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   7.1142259562077328e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   7.1301414505169225e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   7.1460569448261122e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   7.1619724391353019e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   7.1778879334444916e+00   9.5492965855137214e+01   1.0000000000000000e+01
			   7.1938034277536813e+00   9.5492965855137214e+01   1.0000000000000000e+01
			
		};
}