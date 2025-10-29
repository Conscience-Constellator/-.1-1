package CC.$.Q$Q;

import CC.$.$Q.$Point;
import CC.$.Q$.Point$;

public class Point_IO_In_Out_Rapr<I_Typ,O_Typ>
	implements Point1$1<I_Typ,O_Typ>
{
//	public static final Clas_Rap Class=Init_StRt(Point_IO_In_Out_Rapr.class
//		,Clas_Rap.class
//	);/*Dep ?done*/

	public Point$<I_Typ> In;
	public $Point<O_Typ> Out;
		@Override
		public O_Typ Point1$1(I_Typ In)
		{
			this.In.Point$(In);

			return Out.$Point();
		}

	public Point_IO_In_Out_Rapr(
		Point$<I_Typ> In,
		$Point<O_Typ> Out)
	{
		this.In=In;
		this.Out=Out;
	}
	public Point_IO_In_Out_Rapr()
	{}

//	static{Init_Nd(Point_IO_In_Out_Rapr.class);}
}