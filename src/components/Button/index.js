import React, { Component } from 'react';
import { Text,View } from 'react-native';

/*
const Button = () => {

  return (
    <View>
        <Text>Button</Text>
    </View>
  );
}

export default Button;
*/

export default class Button extends Component {
    render() {
        return (
            <View>
                <Text>{this.props.title}</Text>
                {this.props.children}
            </View>
        )
    }
}