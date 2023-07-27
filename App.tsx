/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React, { Fragment, Component } from 'react';
import { Alert, SafeAreaView, StatusBar, Text, TextInput, TouchableOpacity, View } from 'react-native';

import Button from './src/components/Button';

export default class App extends Component {
  state = {
      contador: 0,
      name: "",
      personagens: []
  };

  apertou = () => {
    this.setState({contador: this.state.contador+1})
  };

  mudouNome = nome => {
    this.setState({name: nome});
  };

  async componentWillMount() {
    try {
      const response = await fetch('https://swapi.co/api/people/?format=json');
      const dataJson = await response.json();

      this.setState({ personagens: dataJson.results });
    } catch (error) {
      console.log(error);
    }
  }

  render() {
    //console.log("render")
    return (
      <Fragment>
          <StatusBar barStyle="dark-content"></StatusBar>
          <SafeAreaView>
            <Text>Hello {this.state.name}</Text>
            <Text>Contador: {this.state.contador}</Text>
            <TextInput 
              value={this.state.name} 
              onChangeText = {nome => this.mudouNome(nome)}
            />
            <TouchableOpacity onPress={this.apertou}>
              <Text>Somar</Text>
            </TouchableOpacity>  

            {this.state.personagens.map(personagem => {
              return <Text key={personagem.name}>{personagem.name}aaaaa</Text>
            })}

          </SafeAreaView>
      </Fragment>
    );
  }
}
