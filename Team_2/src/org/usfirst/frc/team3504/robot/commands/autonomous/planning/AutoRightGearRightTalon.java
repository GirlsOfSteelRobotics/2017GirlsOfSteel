package org.usfirst.frc.team3504.robot.commands.autonomous.planning;

public class AutoRightGearRightTalon {
	public static final int kNumPoints =185;		
	// Position (rotations)	Velocity (RPM)	Duration (ms)
	public static double [][]Points = new double[][]{
		{0,	0	,10},
		{0.0039789,	23.873	,10},
		{0.011937,	47.746	,10},
		{0.023873,	71.62	,10},
		{0.039789,	95.493	,10},
		{0.055704,	95.493	,10},
		{0.07162,	95.493	,10},
		{0.087535,	95.493	,10},
		{0.10345,	95.493	,10},
		{0.11937,	95.493	,10},
		{0.13528,	95.493	,10},
		{0.1512,	95.493	,10},
		{0.16711,	95.493	,10},
		{0.18303,	95.493	,10},
		{0.19894,	95.493	,10},
		{0.21486,	95.493	,10},
		{0.23077,	95.493	,10},
		{0.24669,	95.493	,10},
		{0.26261,	95.493	,10},
		{0.27852,	95.493	,10},
		{0.29444,	95.493	,10},
		{0.31035,	95.493	,10},
		{0.32627,	95.493	,10},
		{0.34218,	95.493	,10},
		{0.3581,	95.493	,10},
		{0.37401,	95.493	,10},
		{0.38993,	95.493	,10},
		{0.40585,	95.493	,10},
		{0.42176,	95.493	,10},
		{0.43768,	95.493	,10},
		{0.45359,	95.493	,10},
		{0.46951,	95.493	,10},
		{0.48542,	95.493	,10},
		{0.50134,	95.493	,10},
		{0.51725,	95.493	,10},
		{0.53317,	95.493	,10},
		{0.54908,	95.493	,10},
		{0.565,	95.493	,10},
		{0.58092,	95.493	,10},
		{0.59683,	95.493	,10},
		{0.61275,	95.493	,10},
		{0.62866,	95.493	,10},
		{0.64458,	95.493	,10},
		{0.66049,	95.493	,10},
		{0.67641,	95.493	,10},
		{0.69232,	95.493	,10},
		{0.70824,	95.493	,10},
		{0.72415,	95.493	,10},
		{0.74007,	95.493	,10},
		{0.75599,	95.493	,10},
		{0.7719,	95.493	,10},
		{0.78782,	95.493	,10},
		{0.80373,	95.493	,10},
		{0.81965,	95.493	,10},
		{0.83556,	95.493	,10},
		{0.85148,	95.493	,10},
		{0.86739,	95.493	,10},
		{0.88331,	95.493	,10},
		{0.89923,	95.493	,10},
		{0.91514,	95.493	,10},
		{0.93106,	95.493	,10},
		{0.94697,	95.493	,10},
		{0.96289,	95.493	,10},
		{0.9788,	95.493	,10},
		{0.99472,	95.493	,10},
		{1.0106,	95.493	,10},
		{1.0265,	95.493	,10},
		{1.0425,	95.493	,10},
		{1.0584,	95.493	,10},
		{1.0743,	95.493	,10},
		{1.0902,	95.493	,10},
		{1.1061,	95.493	,10},
		{1.122,	95.493	,10},
		{1.138,	95.493	,10},
		{1.1539,	95.493	,10},
		{1.1698,	95.493	,10},
		{1.1857,	95.493	,10},
		{1.2016,	95.493	,10},
		{1.2175,	95.493	,10},
		{1.2335,	95.493	,10},
		{1.2494,	95.493	,10},
		{1.2653,	95.493	,10},
		{1.2812,	95.493	,10},
		{1.2971,	95.493	,10},
		{1.313,	95.493	,10},
		{1.3289,	95.493	,10},
		{1.3449,	95.493	,10},
		{1.3608,	95.493	,10},
		{1.3767,	95.493	,10},
		{1.3926,	95.493	,10},
		{1.4085,	95.493	,10},
		{1.4244,	95.493	,10},
		{1.4404,	95.493	,10},
		{1.4563,	95.493	,10},
		{1.4722,	95.493	,10},
		{1.4881,	95.493	,10},
		{1.504,	95.493	,10},
		{1.5199,	95.493	,10},
		{1.5358,	95.493	,10},
		{1.5518,	95.493	,10},
		{1.5677,	95.493	,10},
		{1.5836,	95.493	,10},
		{1.5995,	95.493	,10},
		{1.6154,	95.493	,10},
		{1.6313,	95.493	,10},
		{1.6473,	95.493	,10},
		{1.6632,	95.493	,10},
		{1.6791,	95.493	,10},
		{1.695,	95.493	,10},
		{1.7109,	95.493	,10},
		{1.7268,	95.493	,10},
		{1.7427,	95.493	,10},
		{1.7587,	95.493	,10},
		{1.7746,	95.493	,10},
		{1.7905,	95.493	,10},
		{1.8064,	95.493	,10},
		{1.8223,	95.493	,10},
		{1.8382,	95.493	,10},
		{1.8542,	95.493	,10},
		{1.8701,	95.493	,10},
		{1.886,	95.493	,10},
		{1.9019,	95.493	,10},
		{1.9178,	95.493	,10},
		{1.9337,	95.493	,10},
		{1.9496,	95.493	,10},
		{1.9656,	95.493	,10},
		{1.9815,	95.493	,10},
		{1.9974,	95.493	,10},
		{2.0133,	95.493	,10},
		{2.0292,	95.493	,10},
		{2.0451,	95.493	,10},
		{2.0611,	95.493	,10},
		{2.077,	95.493	,10},
		{2.0929,	95.493	,10},
		{2.1088,	95.493	,10},
		{2.1247,	95.493	,10},
		{2.1406,	95.493	,10},
		{2.1565,	95.493	,10},
		{2.1725,	95.493	,10},
		{2.1884,	95.493	,10},
		{2.2043,	95.493	,10},
		{2.2202,	95.493	,10},
		{2.2361,	95.493	,10},
		{2.252,	95.493	,10},
		{2.268,	95.493	,10},
		{2.2839,	95.493	,10},
		{2.2998,	95.493	,10},
		{2.3157,	95.493	,10},
		{2.3316,	95.493	,10},
		{2.3475,	95.493	,10},
		{2.3635,	95.493	,10},
		{2.3794,	95.493	,10},
		{2.3953,	95.493	,10},
		{2.4112,	95.493	,10},
		{2.4271,	95.493	,10},
		{2.443,	95.493	,10},
		{2.4589,	95.493	,10},
		{2.4749,	95.493	,10},
		{2.4908,	95.493	,10},
		{2.5067,	95.493	,10},
		{2.5226,	95.493	,10},
		{2.5385,	95.493	,10},
		{2.5544,	95.493	,10},
		{2.5704,	95.493	,10},
		{2.5863,	95.493	,10},
		{2.6022,	95.493	,10},
		{2.6181,	95.493	,10},
		{2.634,	95.493	,10},
		{2.6499,	95.493	,10},
		{2.6658,	95.493	,10},
		{2.6818,	95.493	,10},
		{2.6977,	95.493	,10},
		{2.7136,	95.493	,10},
		{2.7295,	95.493	,10},
		{2.7454,	95.493	,10},
		{2.7613,	95.493	,10},
		{2.7773,	95.493	,10},
		{2.7932,	95.493	,10},
		{2.8091,	95.493	,10},
		{2.825,	95.493	,10},
		{2.8409,	95.493	,10},
		{2.8568,	95.493	,10},
		{2.8727,	95.493	,10},
		{2.8887,	95.493	,10},
		{2.9046,	95.493	,10},
		{2.9205,	95.493	,10},
		{2.9364,	95.493	,10},
		{2.9523,	95.493	,10},
		{2.9682,	95.493	,10},
		{2.9842,	95.493	,10},
		{3.0001,	95.493	,10},
		{3.016,	95.493	,10},
		{3.0319,	95.493	,10},
		{3.0478,	95.493	,10},
		{3.0637,	95.493	,10},
		{3.0796,	95.493	,10},
		{3.0956,	95.493	,10},
		{3.1115,	95.493	,10},
		{3.1274,	95.493	,10},
		{3.1433,	95.493	,10},
		{3.1592,	95.493	,10},
		{3.1751,	95.493	,10},
		{3.1911,	95.493	,10},
		{3.207,	95.493	,10},
		{3.2229,	95.493	,10},
		{3.2388,	95.493	,10},
		{3.2547,	95.493	,10},
		{3.2706,	95.493	,10},
		{3.2865,	95.493	,10},
		{3.3025,	95.493	,10},
		{3.3184,	95.493	,10},
		{3.3343,	95.493	,10},
		{3.3502,	95.493	,10},
		{3.3661,	95.493	,10},
		{3.382,	95.493	,10},
		{3.398,	95.493	,10},
		{3.4139,	95.493	,10},
		{3.4298,	95.493	,10},
		{3.4457,	95.493	,10},
		{3.4616,	95.493	,10},
		{3.4775,	95.493	,10},
		{3.4935,	95.493	,10},
		{3.5094,	95.493	,10},
		{3.5253,	95.493	,10},
		{3.5412,	95.493	,10},
		{3.5571,	95.493	,10},
		{3.577,	119.37	,10},
		{3.5969,	119.37	,10},
		{3.6168,	119.37	,10},
		{3.6367,	119.37	,10},
		{3.6566,	119.37	,10},
		{3.6765,	119.37	,10},
		{3.6964,	119.37	,10},
		{3.7163,	119.37	,10},
		{3.7362,	119.37	,10},
		{3.7561,	119.37	,10},
		{3.776,	119.37	,10},
		{3.7958,	119.37	,10},
		{3.8157,	119.37	,10},
		{3.8356,	119.37	,10},
		{3.8555,	119.37	,10},
		{3.8754,	119.37	,10},
		{3.8953,	119.37	,10},
		{3.9152,	119.37	,10},
		{3.9351,	119.37	,10},
		{3.955,	119.37	,10},
		{3.9749,	119.37	,10},
		{3.9948,	119.37	,10},
		{4.0147,	119.37	,10},
		{4.0346,	119.37	,10},
		{4.0545,	119.37	,10},
		{4.0744,	119.37	,10},
		{4.0943,	119.37	,10},
		{4.1142,	119.37	,10},
		{4.134,	119.37	,10},
		{4.1539,	119.37	,10},
		{4.1738,	119.37	,10},
		{4.1937,	119.37	,10},
		{4.2136,	119.37	,10},
		{4.2335,	119.37	,10},
		{4.2534,	119.37	,10},
		{4.2733,	119.37	,10},
		{4.2932,	119.37	,10},
		{4.3131,	119.37	,10},
		{4.333,	119.37	,10},
		{4.3529,	119.37	,10},
		{4.3728,	119.37	,10},
		{4.3927,	119.37	,10},
		{4.4126,	119.37	,10},
		{4.4325,	119.37	,10},
		{4.4524,	119.37	,10},
		{4.4723,	119.37	,10},
		{4.4921,	119.37	,10},
		{4.512,	119.37	,10},
		{4.5319,	119.37	,10},
		{4.5518,	119.37	,10},
		{4.5717,	119.37	,10},
		{4.5916,	119.37	,10},
		{4.6115,	119.37	,10},
		{4.6314,	119.37	,10},
		{4.6513,	119.37	,10},
		{4.6712,	119.37	,10},
		{4.6911,	119.37	,10},
		{4.711,	119.37	,10},
		{4.7309,	119.37	,10},
		{4.7508,	119.37	,10},
		{4.7707,	119.37	,10},
		{4.7906,	119.37	,10},
		{4.8105,	119.37	,10},
		{4.8304,	119.37	,10},
		{4.8502,	119.37	,10},
		{4.8701,	119.37	,10},
		{4.89,	119.37	,10},
		{4.9099,	119.37	,10},
		{4.9298,	119.37	,10},
		{4.9497,	119.37	,10},
		{4.9696,	119.37	,10},
		{4.9895,	119.37	,10},
		{5.0094,	119.37	,10},
		{5.0293,	119.37	,10},
		{5.0492,	119.37	,10},
		{5.0691,	119.37	,10},
		{5.089,	119.37	,10},
		{5.1089,	119.37	,10},
		{5.1288,	119.37	,10},
		{5.1487,	119.37	,10},
		{5.1686,	119.37	,10},
		{5.1885,	119.37	,10},
		{5.2083,	119.37	,10},
		{5.2282,	119.37	,10},
		{5.2481,	119.37	,10},
		{5.268,	119.37	,10},
		{5.2879,	119.37	,10},
		{5.3078,	119.37	,10},
		{5.3277,	119.37	,10},
		{5.3476,	119.37	,10},
		{5.3675,	119.37	,10},
		{5.3874,	119.37	,10},
		{5.4073,	119.37	,10},
		{5.4272,	119.37	,10},
		{5.4471,	119.37	,10},
		{5.467,	119.37	,10},
		{5.4869,	119.37	,10},
		{5.5068,	119.37	,10},
		{5.5267,	119.37	,10},
		{5.5465,	119.37	,10},
		{5.5664,	119.37	,10},
		{5.5863,	119.37	,10},
		{5.6062,	119.37	,10},
		{5.6261,	119.37	,10},
		{5.646,	119.37	,10},
		{5.6659,	119.37	,10},
		{5.6858,	119.37	,10},
		{5.7057,	119.37	,10},
		{5.7256,	119.37	,10},
		{5.7455,	119.37	,10},
		{5.7654,	119.37	,10},
		{5.7853,	119.37	,10},
		{5.8052,	119.37	,10},
		{5.8251,	119.37	,10},
		{5.845,	119.37	,10},
		{5.8649,	119.37	,10},
		{5.8848,	119.37	,10},
		{5.9046,	119.37	,10},
		{5.9245,	119.37	,10},
		{5.9444,	119.37	,10},
		{5.9643,	119.37	,10},
		{5.9802,	95.493	,10},
		{5.9962,	95.493	,10},
		{6.0121,	95.493	,10},
		{6.028,	95.493	,10},
		{6.0439,	95.493	,10},
		{6.0598,	95.493	,10},
		{6.0757,	95.493	,10},
		{6.0917,	95.493	,10},
		{6.1076,	95.493	,10},
		{6.1235,	95.493	,10},
		{6.1394,	95.493	,10},
		{6.1553,	95.493	,10},
		{6.1712,	95.493	,10},
		{6.1871,	95.493	,10},
		{6.2031,	95.493	,10},
		{6.219,	95.493	,10},
		{6.2349,	95.493	,10},
		{6.2508,	95.493	,10},
		{6.2667,	95.493	,10},
		{6.2826,	95.493	,10},
		{6.2986,	95.493	,10},
		{6.3145,	95.493	,10},
		{6.3304,	95.493	,10},
		{6.3463,	95.493	,10},
		{6.3622,	95.493	,10},
		{6.3781,	95.493	,10},
		{6.394,	95.493	,10},
		{6.41,	95.493	,10},
		{6.4259,	95.493	,10},
		{6.4418,	95.493	,10},
		{6.4577,	95.493	,10},
		{6.4736,	95.493	,10},
		{6.4895,	95.493	,10},
		{6.5055,	95.493	,10},
		{6.5214,	95.493	,10},
		{6.5373,	95.493	,10},
		{6.5532,	95.493	,10},
		{6.5691,	95.493	,10},
		{6.585,	95.493	,10},
		{6.601,	95.493	,10},
		{6.6169,	95.493	,10},
		{6.6328,	95.493	,10},
		{6.6487,	95.493	,10},
		{6.6646,	95.493	,10},
		{6.6805,	95.493	,10},
		{6.6964,	95.493	,10},
		{6.7124,	95.493	,10},
		{6.7283,	95.493	,10},
		{6.7442,	95.493	,10},
		{6.7641,	119.37	,10},
		{6.784,	119.37	,10},
		{6.8039,	119.37	,10},
		{6.8238,	119.37	,10},
		{6.8437,	119.37	,10},
		{6.8636,	119.37	,10},
		{6.8835,	119.37	,10},
		{6.9033,	119.37	,10},
		{6.9232,	119.37	,10},
		{6.9431,	119.37	,10},
		{6.963,	119.37	,10},
		{6.9829,	119.37	,10},
		{7.0028,	119.37	,10},
		{7.0227,	119.37	,10},
		{7.0426,	119.37	,10},
		{7.0625,	119.37	,10},
		{7.0824,	119.37	,10},
		{7.1023,	119.37	,10},
		{7.1222,	119.37	,10},
		{7.1421,	119.37	,10},
		{7.162,	119.37	,10},
		{7.1819,	119.37	,10},
		{7.2018,	119.37	,10},
		{7.2217,	119.37	,10},
		{7.2415,	119.37	,10},
		{7.2614,	119.37	,10},
		{7.2813,	119.37	,10},
		{7.3012,	119.37	,10},
		{7.3211,	119.37	,10},
		{7.341,	119.37	,10},
		{7.3609,	119.37	,10},
		{7.3808,	119.37	,10},
		{7.4007,	119.37	,10},
		{7.4206,	119.37	,10},
		{7.4405,	119.37	,10},
		{7.4604,	119.37	,10},
		{7.4803,	119.37	,10},
		{7.5002,	119.37	,10},
		{7.5201,	119.37	,10},
		{7.54,	119.37	,10},
		{7.5599,	119.37	,10},
		{7.5798,	119.37	,10},
		{7.5996,	119.37	,10},
		{7.6195,	119.37	,10},
		{7.6394,	119.37	,10},
		{7.6593,	119.37	,10},
		{7.6792,	119.37	,10},
		{7.6991,	119.37	,10},
		{7.719,	119.37	,10},
		{7.7389,	119.37	,10},
		{7.7588,	119.37	,10},
		{7.7787,	119.37	,10},
		{7.7986,	119.37	,10},
		{7.8145,	95.493	,10},
		{7.8304,	95.493	,10},
		{7.8463,	95.493	,10},
		{7.8623,	95.493	,10},
		{7.8782,	95.493	,10},
		{7.8941,	95.493	,10},
		{7.91,	95.493	,10},
		{7.9259,	95.493	,10},
		{7.9418,	95.493	,10},
		{7.9577,	95.493	,10},
		{7.9737,	95.493	,10},
		{7.9896,	95.493	,10},
		{8.0055,	95.493	,10},
		{8.0214,	95.493	,10},
		{8.0373,	95.493	,10},
		{8.0532,	95.493	,10},
		{8.0692,	95.493	,10},
		{8.0851,	95.493	,10},
		{8.101,	95.493	,10},
		{8.1169,	95.493	,10},
		{8.1328,	95.493	,10},
		{8.1487,	95.493	,10},
		{8.1646,	95.493	,10},
		{8.1806,	95.493	,10},
		{8.1965,	95.493	,10},
		{8.2124,	95.493	,10},
		{8.2283,	95.493	,10},
		{8.2442,	95.493	,10},
		{8.2601,	95.493	,10},
		{8.2761,	95.493	,10},
		{8.292,	95.493	,10},
		{8.3079,	95.493	,10},
		{8.3238,	95.493	,10},
		{8.3397,	95.493	,10},
		{8.3556,	95.493	,10},
		{8.3716,	95.493	,10},
		{8.3875,	95.493	,10},
		{8.4034,	95.493	,10},
		{8.4193,	95.493	,10},
		{8.4352,	95.493	,10},
		{8.4511,	95.493	,10},
		{8.467,	95.493	,10},
		{8.483,	95.493	,10},
		{8.4989,	95.493	,10},
		{8.5148,	95.493	,10},
		{8.5307,	95.493	,10},
		{8.5466,	95.493	,10},
		{8.5625,	95.493	,10},
		{8.5785,	95.493	,10}
	};
}
