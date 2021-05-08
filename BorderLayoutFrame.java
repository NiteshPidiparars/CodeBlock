import java.awt.BorderLayout;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;

import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame implements ActionListener
{

    private JButton[] buttons;
    private static final String[] names = { "UP", "DOWN", "RIGHT", "LEFT", };
    private BorderLayout layout;


    public BorderLayoutFrame()
    {
        super ("BorderLayout Demo");

        layout = new BorderLayout( 5, 5);
        setLayout( layout );
         buttons = new JButton[ names.length ];

        for ( int count = 0; count < names.length; count++ )
        {
            buttons[ count ] = new JButton( names[ count ] );
            buttons[ count ].addActionListener( this );
        }

        add( buttons[ 0 ], BorderLayout.UP );
        add( buttons[ 1 ], BorderLayout.DOWN );
        add( buttons[ 2 ], BorderLayout.RIGHT );
        add( buttons[ 3 ], BorderLayout.LEFT );
    }

    public void actionPerformed( ActionEvent event )
    {
        for ( JButton button  : buttons )
        {
           if ( event.getSource() == button)
               button.setVisible( false );

               button.setVisible( true );
            }
            layout. layoutContainer( getContentPane() );

}
}
