import React, { Fragment } from 'react';
import { SafeAreaView,StatusBar,Text,View } from 'react-native';

function App(): JSX.Element {

  return (
    <Fragment>
        <StatusBar barStyle="dark-content"></StatusBar>
        <SafeAreaView>
          <Text>Teste</Text>
        </SafeAreaView>
    </Fragment>
  );
}

export default App;